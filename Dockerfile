FROM eclipse-temurin:17
COPY target/mypro.jar myjen.jar
CMD ["java","-jar","myjen.jar"]