# Use the correct Tomcat base image
FROM tomcat:9.0-jdk8-adoptopenjdk-hotspot

# Expose port 8080 to allow external access to the application
EXPOSE 8080

# Set the working directory for the application
WORKDIR /usr/local/tomcat/webapps

# Copy the WAR file into the webapps directory of Tomcat
COPY target/ZoomCustomer-0.0.1.war ./ROOT.war

# Start the Tomcat server
CMD ["catalina.sh", "run"]

