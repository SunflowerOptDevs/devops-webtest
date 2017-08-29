# Project:webtest

Project 'webtest' is a web project  for testing of jenkins.

# Integrating TestNG for Junit.

In eclipse or STS you can install TestNG plugin to 'Run as' TestNG.xml . To edit TestNG.xml and set the classes which you expected to test.

TestNG.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<suite name="Suite" parallel="false">
	<test name="Test">
		<classes>
			<class name="com.boonya.app.test.FirstTest" />
			<class name="com.boonya.app.test.SecondTest" />
			<class name="com.boonya.app.test.ThirdTest" />
			<!--<class name="com.boonya.app.test.selenium.LinuxSeleniumTest" />-->
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->
```
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
Besides, you can send an email(from:http://www.cnblogs.com/MasterMonkInTemple/p/3375761.html):

```
<target name="sendEmail">
        <mail mailhost="stmp.qq.com" mailport="25" from="12345678@qq.com" user="12345678" password="*****" subject="SmokeTest Report!" messagefile="${JMeter.home}/extras/AutoTestReport${time}_failure.html" messagemimetype="text/html" tolist="${to_me_only}">
            <fileset dir="${jmeter.home}/extras/">
                <!-- <include name="AutoTestReport${time}.html"/> -->
                <include name="expand.png"/>
            </fileset>
            <!-- <message>This email was sent automatically by ANT. <br />
            Please check the automation test report by the link below.  <br />
            If there are any questions, please contact with mim Zhang. Thank you! <br /><br />
            http://SZCOMPUTER/AutoTestReport${time}.html
            </message> -->
        </mail>
</target>
```
