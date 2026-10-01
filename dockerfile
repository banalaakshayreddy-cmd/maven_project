FROM tomcat:9.0-jdk17-temurin


# Remove default ROOT application

RUN rm -rf /usr/local/tomcat/webapps/ROOT


# Copy your generated WAR file to ROOT.war (note the spaces)

COPY target/*.war /usr/local/tomcat/webapps/ROOT.war


EXPOSE 8080


CMD ["catalina.sh", "run"]
