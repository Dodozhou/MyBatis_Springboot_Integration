package com.star;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.star.mapper")
public class MybatisBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisBootApplication.class, args);
	}
}
