Chỉnh lại cấu hình [pom.xml](pom.xml)
```xml
<properties>
		<java.version>16</java.version>
		<spring-cloud.version>2020.0.3</spring-cloud.version>
	</properties>
	<dependencies>		
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
			<version>3.0.3</version>
		</dependency>
...
```
```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-parent</artifactId>
      <version>${spring-cloud.version}</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
    <!--<dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-dependencies</artifactId>
      <version>${spring-cloud.version}</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>-->
  </dependencies>
</dependencyManagement>
```