# GraalVM image
FROM registry.access.redhat.com/ubi8/ubi-minimal:8.6
WORKDIR /work/
RUN chown 1001 /work \
    && chmod "g+rwX" /work \
    && chown 1001:root /work
COPY --chown=1001:root target/*-runner /work/application

# Add TLS certificates if needed
COPY --chown=185 src/main/resources/tls/* /tls/

COPY --chown=1001:root docker/entrypoint_native.sh /work/entrypoint.sh
RUN chmod 777 ./entrypoint.sh

ENTRYPOINT ["./entrypoint.sh"]
