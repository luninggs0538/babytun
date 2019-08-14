package com.itlaoqi.babytun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 在学习过程中遇到任何问题可以加我的QQ群722570599(老齐的IT指导群)
 在这里老齐将给你直接提供帮助与解答，只为你可以学的更轻松。
 */
@SpringBootApplication
@MapperScan("com.itlaoqi.babytun") //mybatis在SpringBoot启动的时候自动扫描mybatis实现的接口
public class BabytunApplication {
	public static void main(String[] args) {
		SpringApplication.run(BabytunApplication.class, args);
	}
}
