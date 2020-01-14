# springboot
由浅入深走进SpringBoot的世界
1. 01-springboot-start：springboot项目的简单创建和启动，无需任何配置文件即可启动一个springboot项目；认识 @SpringBootApplication

2. 02-springboot-config：请详细阅读该module下的resources下的 README.md 文件

3. SpringBoot定时任务实现
  (1) 启动类添加注解 @EnableScheduling 
  (2) 任务类添加注解 @Component, 
  (3) 方法添加注解 @Scheduled
  问题：SpringBoot默认把所有的定时任务放在一个线程中执行，所以会发生任务之间互相影响的问题
  解决方式：在启动类添加 @EnableAsync，方法添加 @Async，保证每个任务都是异步的，单独的线程去执行
