FROM registry.htres.cn/yunlu/jdk8-alpine:latest

ENV RUN_PREFIX  /opt
ENV APP_NAME exp1-0.0.1-SNAPSHOT.jar
RUN mkdir -p ${RUN_PREFIX}
WORKDIR ${RUN_PREFIX}

EXPOSE 8080

ADD build/libs/${APP_NAME}.war /opt/
CMD ["sh", "-c", "${RUN_PARAM}"]