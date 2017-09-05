FROM boonyadocker/centos-tomcat
MAINTAINER boonya <boonya@sina.com>   
# now add java and tomcat support in the container   
ADD webtest-0.0.1-SNAPSHOT.war /usr/local/apache-tomcat-8.5.16/webapps/   
# container listener port   
EXPOSE 8080   
# startup web application services by self   
CMD /usr/local/apache-tomcat-8.5.16/bin/catalina.sh run  