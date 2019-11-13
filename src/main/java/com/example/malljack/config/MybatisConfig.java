package com.example.malljack.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MybatisConfig
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/15
 * @Version V1.0
 **/
@Configuration
@MapperScan("com.example.malljack.mbg.mapper")
public class MybatisConfig {

}
