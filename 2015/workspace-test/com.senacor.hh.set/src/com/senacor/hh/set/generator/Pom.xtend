package com.senacor.hh.set.generator

import com.senacor.hh.set.setDsl.Service
import com.senacor.hh.set.setDsl.DeploymentEnum

class Pom {
	def static generateRootPom(Iterable<Service> services) '''
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                      http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-parent</artifactId>
      <version>1.2.1.RELEASE</version>
  </parent>

  <groupId>com.senacor.hh</groupId>
  <artifactId>services</artifactId>
  <packaging>pom</packaging>
  <version>1.0</version>

  <modules>
    «FOR s : services»
    <module>«s.name»</module>
    «ENDFOR»
  </modules>
</project>
	'''
	
	def static generateServicePom(Service service) '''
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>com.senacor.hh</groupId>
        <artifactId>services</artifactId>
        <version>1.0</version>
    </parent>

    <groupId>com.senacor.hh.services</groupId>
    <artifactId>«service.name»</artifactId>
    <packaging>jar</packaging>
    <version>1.0</version>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>com.senacor.hh.services</groupId>
            <artifactId>base</artifactId>
            <version>1.0</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>1.2.1.RELEASE</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                        <configuration>
                            «IF service.deployment == DeploymentEnum.HZ»
                            <mainClass>com.senacor.services.«service.name».HZ«service.name»Impl</mainClass>
                            «ELSEIF service.deployment == DeploymentEnum.MS»
                            <mainClass>com.senacor.services.«service.name».MS«service.name»Impl</mainClass>
                            «ENDIF»
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>	'''
}