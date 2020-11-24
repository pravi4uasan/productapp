FROM java:8

EXPOSE 8080

ADD target/productsreview-0.0.1-SNAPSHOT.jar productreview.jar

ENTRYPOINT ["java ","jar","productreview.jar"]