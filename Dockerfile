FROM boonyadocker/centos-tomcat
MAINTAINER boonya <boonya@sina.com>
# add war to tomcat
ADD /target/*.war /usr/local/apache-tomcat-8.5.16/webapps/
EXPOSE 8080   
# startup web application services by self   
CMD /usr/local/apache-tomcat-8.5.16/bin/catalina.sh run  
