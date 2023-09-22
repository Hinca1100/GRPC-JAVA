#!/bin/sh
java -Djava.security.egd=file:/dev/./urandom -Xms256m -Xmx1024m  -jar /deployments/quarkus-run.jar
echo '**** Launching application ****'