# Project:webtest
Project 'webtest' is a web project  for testing of jenkins.

# Integrating TestNG for Junit.
In eclipse or STS you can install TestNG plugin to 'Run as' TestNG.xml

# Learning Selenium

Selenium support languages:C#，Java，Perl，PHP，Python，Ruby 

Official Website：http://seleniumhq.org/

Help docs：http://seleniumhq.org/docs/

Selenium Tutorial: http://www.yiibai.com/selenium/

Selenium for java environment:http://blog.csdn.net/fjssharpsword/article/details/53691860

Selenium for python example: http://www.cnblogs.com/kgdxpr/p/6165100.html

# Integrating JMeter performance test.

In this project  maven-antrun-plugin is 1.4,if you want use more lately version you can do this:

pom.xml
```
              <plugin>
                    <groupId>com.lazerycode.jmeter</groupId>
                    <artifactId>jmeter-maven-plugin</artifactId>
                    <version>2.0.3</version>
                    <executions>
                        <execution>
                            <id>jmeter-tests</id>
                            <goals>
                                <goal>jmeter</goal>
                            </goals>
                        </execution>
                    </executions>
                    <configuration>
                        <jmeterExtensions>
                            <artifact>com.demo.jmeter:demo:1.0.0</artifact>
                        </jmeterExtensions>
                    </configuration>
                </plugin>
```
You can based on Ant to  build run jmeter test plans.

build.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<project default="jmeter" >
	
	<property name="jmeter.home" value="${basedir}/tools/apache-jmeter-3.2"  />  
	
	<path  id="ant.jmeter.classpath" >
		<pathelement location="${basedir}/tools/apache-jmeter-3.2/extras/ant-jmeter-1.1.1.jar" />
	</path>

	<taskdef name="jmeter" classname="org.programmerplanet.ant.taskdefs.jmeter.JMeterTask" classpathref="ant.jmeter.classpath" />  

	<target name="jmeter">
		<jmeter jmeterhome="${jmeter.home}" 
		    resultlog="${basedir}/target/jemeter-results.jtl"
			testplan="${basedir}/src/test/jemeter/hello.jmx">
			<jvmarg value="-Xmx512m" />
		</jmeter>
	</target>

</project>
```
