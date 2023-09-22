#!/bin/zsh
# Inspired from: https://github.com/grpc/grpc-java/tree/master/examples#generating-self-signed-certificates-for-use-with-grpc

# Output files
# ca.key: Certificate Authority private key file (this shouldn't be shared in real-life)
# ca.crt: Certificate Authority trust certificate (this should be shared with users in real-life)
# server.key: Server private key, password protected (this shouldn't be shared)
# server.csr: Server certificate signing request (this should be shared with the CA owner)
# server.crt: Server certificate signed by the CA (this would be sent back by the CA owner) - keep on server
# server.pem: Conversion of server.key into a format gRPC likes (this shouldn't be shared)

# Summary
# Private files: ca.key, server.key, server.pem, server.crt
# "Share" files: ca.crt (needed by the client), server.csr (needed by the CA)

# Changes these CN's to match your hosts in your environment if needed.

rm *.crt
rm *.key
rm *.csr
rm *.pem

SERVER_CN=localhost
IP=0.0.0.0
DAYS=3650
PASS=1111

# Step 1: Generate Certificate Authority + Trust Certificate (ca.crt)
openssl genrsa -passout pass:${PASS} -des3 -out ca.key 4096
openssl req -passin pass:${PASS} -new -x509 -days ${DAYS} -key ca.key -out ca.crt -subj "/CN=${SERVER_CN}"

# Step 2: Generate the Server Private Key (server.key)
openssl genrsa -passout pass:${PASS} -des3 -out server.key 4096

# Step 3: Get a certificate signing request from the CA (server.csr)
openssl req -passin pass:${PASS} -new -key server.key -out server.csr -subj "/CN=${SERVER_CN}"

# Step 4: Sign the certificate with the CA we created (it's called self signing) - server.crt
echo "subjectAltName=DNS:${SERVER_CN},IP:${IP}" > client-ext.cnf
openssl x509 -req -passin pass:${PASS} -days ${DAYS} -in server.csr -CA ca.crt -CAkey ca.key -set_serial 01 -out server.crt -extfile client-ext.cnf
rm client-ext.cnf

# Step 5: Convert the server certificate to .pem format (server.pem) - usable by gRPC
openssl pkcs8 -topk8 -nocrypt -passin pass:${PASS} -in server.key -out server.pem