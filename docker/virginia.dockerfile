# distroless image
FROM amazoncorretto:11-alpine-jdk

ENV LANG=C.UTF-8 \
  LC_ALL=C.UTF-8
VOLUME /tmp

# We make four distinct layers so if there are application changes the library layers can be re-used
COPY --chown=185 target/quarkus-app/lib/ /deployments/lib/
COPY --chown=185 target/quarkus-app/*.jar /deployments/
COPY --chown=185 target/quarkus-app/app/ /deployments/app/
COPY --chown=185 target/quarkus-app/quarkus/ /deployments/quarkus/

# Add TLS certs if needed
COPY --chown=185 src/main/resources/tls/* /tls/

RUN /bin/sh -c 'touch /app.jar'
COPY docker/entrypoint.sh /entrypoint.sh
RUN chmod 777 /entrypoint.sh

ENTRYPOINT ["./entrypoint.sh"]
