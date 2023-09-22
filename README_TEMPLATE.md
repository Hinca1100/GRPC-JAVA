# bbog-dig-dt-quarkus-grpc-mngr-template

Template for the generation of Java projects that expose gRPC services.

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit: 
- [Quarkus main page](https://quarkus.io/)

To learn more about GraalVM, please visit:
- [GraalVM](https://www.graalvm.org/)
- [Building a Native Executable](https://quarkus.io/guides/building-native-image)

If you want to consult a more robust project, please check the [bbog-dig-dt-quarkus-mngr-template](https://github.com/bancodebogota/bbog-dig-dt-quarkus-mngr-template) repository.

### Implemented technologies

> - [Quarkus - Framework](https://quarkus.io/)
> - [Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
> - [JUnit 5](https://junit.org/junit5/)
> - [gRPC](https://grpc.io/)
> - [Project Lombok](https://projectlombok.org/)

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
mvn compile quarkus:dev
```

## gRPC services definition

You can see the definition of the services in the [numberGeneration.proto](src/main/proto/v1/numberGeneration.proto) file.

It has two services:
1. **GeneratedNumbers** -> Generates several number randomly using different methods.
2. **GeneratedMultipleSecureRandom** -> Generates a random number every 2 seconds.

## How to use

Start the component in development mode then execute the curl command:

### Interact with gRPC Server

You can use Postman to run tests, but you also have the option to use [grpcurl](https://github.com/fullstorydev/grpcurl).

Generate Random Numbers (for dev mode test):

```shell script
grpcurl -format-error -plaintext -d '{ "request_id": "71231000-2977-4fef-9362-64f262577806", "min_range": -59, "max_range": 177 }' localhost:8900 v1.NumberGeneration/GeneratedNumbers 
```

Generate multiple Secured Random Numbers (for dev mode test):

```shell script
grpcurl -format-error -plaintext -d '{ "request_id": "3256c5e8-9bf4-412a-8126-55ce46e21a79" }' localhost:8900 v1.NumberGeneration/GeneratedMultipleSecureRandom 
```

### Enable TLS

If you require TLS to be enabled please perform the following steps before starting the component

1. Generate a self-signed certificate running [this bash file](src/main/resources/tls/generate_keys.sh)

```shell script
sh src/main/resources/tls/generate_keys.sh 
```

2. Remove the comments on lines 7 and 8 of the [application.properties](src/main/resources/application.properties) file

```text
[...]
6   #TLS - https://quarkus.io/guides/grpc-service-implementation#enabling-tls
7   quarkus.grpc.server.ssl.certificate=tls/server.crt
8   quarkus.grpc.server.ssl.key=tls/server.pem
[...]
```

3. Run the application

```shell script
mvn compile quarkus:dev
```

4. Call the gRPC services

> The ca.crt file was generated in the following path 'src/main/resources/tls/'

Generate Random Numbers (for dev mode test):

```shell script
grpcurl -format-error -cacert src/main/resources/tls/ca.crt -d '{ "request_id": "2a880d23-d468-4410-aa66-190ce2841cc4", "min_range": -59, "max_range": 177 }' localhost:8900 v1.NumberGeneration/GeneratedNumbers 
```

Generate multiple Secured Random Numbers (for dev mode test):

```shell script
grpcurl -format-error -cacert src/main/resources/tls/ca.crt -d '{ "request_id": "5d5d983c-f474-46ec-b9ff-deb3a0da4052" }' localhost:8900 v1.NumberGeneration/GeneratedMultipleSecureRandom 
```

## Build docker image and test locally
If you want to test both containers simultaneously, **PLEASE** change the exposed port in docker.

To interact with gRPC services in the container use the following commands

Generate Random Numbers (for container and native executable test):

```shell script
grpcurl -format-error -proto src/main/proto/v1/numberGeneration.proto -plaintext -d '{ "request_id": "6c949cb6-95e9-4265-990a-fa1ffd658c71", "min_range": -59, "max_range": 177 }' localhost:8900 v1.NumberGeneration/GeneratedNumbers

# If TLS is enabled
grpcurl -format-error -proto src/main/proto/v1/numberGeneration.proto -cacert src/main/resources/tls/ca.crt -d '{ "request_id": "3738483f-96d6-44de-b43f-ccb921f742cf", "min_range": -59, "max_range": 177 }' localhost:8900 v1.NumberGeneration/GeneratedNumbers 
```

Generate multiple Secured Random Numbers (for container and native executable test):

```shell script
grpcurl -proto src/main/proto/v1/numberGeneration.proto -plaintext -d '{ "request_id": "d345bdc1-1998-44a7-99c2-01562cedb8e9" }' localhost:8900 v1.NumberGeneration/GeneratedMultipleSecureRandom

# If TLS is enabled
grpcurl -proto src/main/proto/v1/numberGeneration.proto -cacert src/main/resources/tls/ca.crt -d '{ "request_id": "9b3f0d44-094f-40dc-971b-8cc428958ecb" }' localhost:8900 v1.NumberGeneration/GeneratedMultipleSecureRandom
```

### Using distroless container and JVM

```shell script
mvn package -Dmaven.test.skip
docker build -f docker/virginia.dockerfile -t quarkus/grpc-template-jvm .
docker run -i --rm -p 8900:8900 quarkus/grpc-template-jvm
```

### Using GraalVM
Check the maven **profiles** to understand what is being done [pom.xml](pom.xml), line 131.
```shell script
mvn package -Pnative
docker build -f docker/virginia_native.dockerfile -t quarkus/grpc-template-graalvm .
docker run -i --rm -p 8900:8900 quarkus/grpc-template-graalvm
```
## Build a native executable (**ONLY** locally)
You need to have GraalVM properly configured locally.

Check the maven **profiles** to understand what is being done [pom.xml](pom.xml), line 147.
```shell script
mvn package -Pnative_locally
./target/bbog-dig-dt-quarkus-grpc-mngr-template-1.0.0-runner 
```