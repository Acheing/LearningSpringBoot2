# Day2

## 系统配置文件

### application.properties

`classpath`应该就是在`src/resource`目录下或者是`target/classes`目录下

### application.yml

yml语法:`key: value` 通过空格缩进来控制层级关系

## 自定义配置

### @Value

读取配置项

### Environment

读取系统自定义的配置项

### @ConfigurationPropertie

将配置项和实体`Bean`关联起来

## 日志配置

### 配置日志输出格式

```properties
logging.pattern.console=%d{yyyy-MM-dd-HH:mm:ss} [%thread] %-5level %logger- %msg%n
logging.pattern.file=%d{yyyy-MM-dd-HH:mm:ss} [%thread] %-5level %logger- %msg%n
```

### 日志输出级别及日志保存

```properties
logging.level.root=INFO
logging.level.com.example.day2.log=WARN
logging.file.name=xxx
```

## 系统的多环境配置

在开发环境、测试环境、生产环境等不同环境中切换`application.properties`的配置

启动时添加参数`--spring.profile.active=xxx`