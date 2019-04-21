1. 在resources下创建一个配置文件 application.yaml(作用同application.properties相同)

2. 在 pom 中引入 mybatis-spring-boot-starter。不同版本的Spring Boot和MyBatis版本对应不一样，
   具体可查看官方文档：
   http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/。

3. 以连接mysql数据库为例，在 pom 中引入mysql的依赖，注意此处引入的版本和安装的mysql版本要匹配
   <dependency>
     <groupId>mysql</groupId>
     <artifactId>mysql-connector-java</artifactId>
   </dependency>
   
4. 引入Druid数据源，Druid是一个关系型数据库连接池，是阿里巴巴的一个开源项目，
   Druid不但提供连接池的功能，还提供监控功能，可以实时查看数据库连接池和SQL查询的工作情况。
   在pom文件中引入Druid的依赖
   <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>druid-spring-boot-starter</artifactId>
   </dependency>
   
5. 在 application.yaml 中配置连接池参数

6. 创建一张测试表 t_student: create.sql

7. 创建Student, StudentController, StudentService, StudentServiceImpl, StudentMapper