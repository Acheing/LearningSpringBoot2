# Day3

## @Controller VS @RestController

请求页面和数据用@Controller，只是请求数据可用@RestController(默认将返回的对象数据转换为JSON格式，不过数据必须是public)

## @ResponseBody

定义数据的返回格式

## RequestMapping

URL的路由映射，可以使用通配符或正则表达式来匹配

此外，还可以通过`Method`来匹配`HTTP Method`

通过`consumes`与`produces`验证`HTTP`请求的内容类型和返回类型

`params`匹配请求POST参数，`headers`匹配请求头

## 参数传递

@PathVariable

实体类接受表单参数/Json数据

## ModelAttribute & ModelAndView

以后再看

## @Data
自动创建`setter`和`getter`等方法

```xml
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.4</version>
            <scope>provided</scope>
        </dependency>
```

## 数据校验

```xml
        <dependency>
            <groupId>javax.validation</groupId>
            <artifactId>validation-api</artifactId>
            <version>2.0.1.Final</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>6.1.5.Final</version>
        </dependency>
```

但是一直弄不好TwT

## 拦截器与过滤器

稍微了解
