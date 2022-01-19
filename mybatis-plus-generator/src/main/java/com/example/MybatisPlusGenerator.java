package com.example;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MybatisPlusGenerator {
    public static void main(String[] args) {
        //当前项目路径
        String projectPath = System.getProperty("user.dir");
        //连接数据库的配置
        String url = "jdbc:mysql://localhost:3306/springboot?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        String username = "root";
        String password = "1234";

        FastAutoGenerator.create(url, username, password)
                //全局配置
                .globalConfig(builder -> {
                    builder.fileOverride() // 覆盖已生成文件
                            .outputDir(projectPath + "/src/main/java") // 指定输出目录
                            .disableOpenDir(); //不打开文件夹
                })
                //包名配置
                .packageConfig(builder -> {
                    builder.parent("com.bjsy") // 设置父包名
                            .service("service")
                            .serviceImpl("service.impl")
                            .controller("controller")
                            .entity("pojo")
                            .mapper("mapper")
                            .xml("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, projectPath + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                //策略配置
                .strategyConfig(builder -> {
                    builder.addInclude("book", "category") // 设置需要生成的表名
                            .entityBuilder() //实体类配置
                            .enableLombok() //开启lombok
                            .disableSerialVersionUID() //禁止生成serialVersionUID
                            .logicDeleteColumnName("delete") //说明逻辑删除字段
                            .controllerBuilder() //controller配置
                            .enableRestStyle() //开启restful api
                            .serviceBuilder() //service配置
                            .formatServiceFileName("%sService") //去掉Service前面的I前缀
                            .mapperBuilder() //mapper配置
                            .enableMapperAnnotation(); //开启@Mapper注解


                })
                .execute();

    }
}
