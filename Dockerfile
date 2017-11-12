FROM openjdk:8

COPY target/netty-demo-1.0-SNAPSHOT-jar-with-dependencies.jar /

EXPOSE 9091 8081

CMD ["java","-jar","-DremotePort=80","-DremoteHost=172.17.0.2","netty-demo-1.0-SNAPSHOT-jar-with-dependencies.jar"]