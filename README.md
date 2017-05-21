1. spring boot - hello word
    1. 简单介绍spring boot
        1. 大家好，我是万夜，今天开始讲解spring boot基础教程，现在的web项目几乎都会用到spring框架，而要使用spring难免需要配置大量的xml配置文件，而springboot的出现解   决了这一问题；
        2. 通过本节课程，让大家掌握通过spring boot 返回json数据，整合jsp/freemarker模板
    2. 创建工程
        1. Spring Boot 1.5 
    3. 编辑pom依赖
    4. 创建启动类
    5. 创建controller
    6. 返回json数据
    7. 讲解注解含义
        1. @SpringBootApplication 等价于 @Configuration 理解为spring的xml配置 + @ComponentScan 组件扫描，如果扫描到有@Component、@Controller、@Service等这些注解的类，并注册为Bean，可以自动收集所有的Spring组件，包括@Configuration类 + @EnableAutoConfiguration 开启自动配置，这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring，建议标记在启动类上 
        2. @RestController 等价于 @Controller + @ResponseBody 返回json数据格式（jackson）
        3. @RequestMapping 提供路由信息，注册访问路径
    8. 关于controller
        1. 接收参数使用方法
        2. 整合jsp模板
        2. 整合freemarker模板
    9. 总结
