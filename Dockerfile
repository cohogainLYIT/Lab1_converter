FROM openjdk:11

MAINTAINER Ciaran O hOgain <l00169829@student.lyit.ie>

COPY . /src/main/java/Lab1_Conv/ 
WORKDIR /src/main/java/Lab1_Conv/src/main/java/Lab1_Conv/
RUN ["javac", "Converter.java"]
ENTRYPOINT ["java", "Converter.java"]


