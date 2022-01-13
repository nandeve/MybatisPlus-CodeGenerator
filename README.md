- 本项目基于一个`springboot`工程，使用普通的`Maven`工程也可实现

- 本项目必须的`Maven`依赖

  ```xml
  <!--mysql驱动-->
  <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <scope>runtime</scope>
  </dependency>
  <!--lombok-->
  <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
  </dependency>
  <!--mybatis-plus-->
  <dependency>
      <groupId>com.baomidou</groupId>
      <artifactId>mybatis-plus-boot-starter</artifactId>
      <version>3.5.0</version>
  </dependency>
  <!--mybatis-plus新版代码生成器-->
  <dependency>
      <groupId>com.baomidou</groupId>
      <artifactId>mybatis-plus-generator</artifactId>
      <version>3.5.1</version>
  </dependency>
  <!--默认模板-->
  <dependency>
      <groupId>org.apache.velocity</groupId>
      <artifactId>velocity-engine-core</artifactId>
      <version>2.3</version>
  </dependency>
  ```

- 使用`IDEA`打开`mybatis-plus-generator`目录，修改`src/main/java/com/example/MybatisPlusGenerator.java`中的代码，然后直接运行即可，将生成的代码复制到自己的项目中即可

- 可能需要修改的配置（参考`MybatisPlusGenerator.java`中的注释）：

  1. 连接数据库的配置
  2. 包名配置
  3. 策略配置

- 参考链接

  - [ 代码生成器（新）](https://baomidou.com/pages/779a6e/)
  - [代码生成器配置新](https://baomidou.com/pages/981406/#%E6%95%B0%E6%8D%AE%E5%BA%93%E9%85%8D%E7%BD%AE-datasourceconfig)
  - [mybatis-plus最新版代码生成器（Swagger3）](https://www.debugger.wiki/article/html/1634136845778168)
  - [Mybatis-plus最新代码生成器（3.5.1+）的使用](https://blog.csdn.net/qq_42682745/article/details/120626012)
  - [MyBatis-Plus——代码生成器（3.5.1+版本）](https://juejin.cn/post/7033399493684903949)