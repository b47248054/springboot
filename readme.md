### spring boot
#### Quick Start
1. pom文件
```
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.5.1.RELEASE</version>
    </parent>
    <dependencies>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

    </dependencies>

```
2. 返回string
```
   @Controller
   public class HelloController {
   
       @RequestMapping("/hello")
       @ResponseBody
       public String hello(){
           return "hello wanye";
       }
   }

```
3. 启动类
```
@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}
```