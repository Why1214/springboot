该模块主要涉及springboot的常用配置

1. 设置启动时候的banner样式，首先在resources目录下创建一个banner.txt，然后在banner.txt输入你想打印的内容
  （ASCII图案可通过网站http://www.network-science.de/ascii/一键生成）;
   也可以将banner进行关闭，application.setBannerMode(Mode.OFF);

2. 通常我们在实际开发中，一些默认的配置参数不能满足我们的需求，因此需要对某些配置进行修改，此时，我们可以在resources
   下创建一个全局配置文件 application.properties
   更多配置请查阅：https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
   a. 自定义属性，并通过 @Value("${属性名}") 的方式将其注入到对象中：如 Animal 类
   b. 通过指定属性前缀的方式也可以方便的注入属性，但是必须使用 @ConfigurationProperties(prefix = "primary.student")
      也必须在Application启动类上加 @EnableConfigurationProperties({Student.class}) 表示启用配置
   c. 属性之间相互引用，如：primary.student.info=${primary.student.name}--${primary.student.num}

3. 有时我们的属性是分类的，这时我们就可以自定义配置文件，比如我现在创建一个手机类配置文件：phone.properties
   a. 创建类 Phone，添加注解 @Configuration ，告诉spring容器创建一个phone对象放在容器中；
      @ConfigurationProperties(prefix = "phone.info") 表示属性的配置
      @PropertySource("classpath:phone.properties") 表示对应的属性文件

4. 修改全局配置，比如我们想改变端口，可以在 application.properties 中配置 server.port=9999