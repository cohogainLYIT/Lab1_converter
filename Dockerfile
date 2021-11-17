FROM ubuntu:20.04

MAINTAINER Ciaran O hOgain <l00169829@student.lyit.ie>

RUN apt-get update && apt-get install -y default-jdk

COPY . /src/main/java/Lab1_Conv/ 
WORKDIR /src/main/java/Lab1_Conv/src/main/java/Lab1_Conv/
RUN ["javac", "Converter.java"]
ENTRYPOINT ["java", "Converter.java"]


