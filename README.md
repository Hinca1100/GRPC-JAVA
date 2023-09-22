# bbog-dt-java-grpc-mngr-seed-template
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=bbog-dt-java-grpc-mngr-seed-template&metric=alert_status&token=7e6956b6ca827f57de0ce9e50088d8bf0b837f49)](https://sonarcloud.io/summary/new_code?id=bbog-dt-java-grpc-mngr-seed-template)

Llene aquí la descripción ampliada arquitect@ o desarrollador@!

// pasos para correr en la instancia de ec2
*instalar docker https://www.cyberciti.biz/faq/how-to-install-docker-on-amazon-linux-2/

*id ec2-user

*Add group membership for the default ec2-user so you can run all docker commands without using the sudo command:$ sudo usermod -a -G docker ec2-user
$ id ec2-user
# Reload a Linux user's group assignments to docker w/o logout
$ newgrp docker
Need docker-compose too? Try any one of the following command:

# 1. Get pip3 sudo yum install python3-pip
 # 2. Then run any one of the followingsudo pip3 install docker-compose # with root access # OR # 
pip3 install --user docker-compose # without root access for security reasons

Enable docker service at AMI boot time:$ sudo systemctl enable docker.service
Start the Docker service:$ sudo systemctl start docker.service

Instalar git : sudo yum install git -y



Crear carpeta en root: mkdir grpc-server


clonar repositorio : git clone https://github.com/Hinca1100/GRPC-JAVA.git


sh up-compose.sh  # "se debe verificar que se encuentre dentro de la carpeta"