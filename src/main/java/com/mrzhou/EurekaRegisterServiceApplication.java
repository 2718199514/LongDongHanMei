package com.mrzhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //开启eurekaz服务,将此项目标示为服务注册中心
@SpringBootApplication
public class EurekaRegisterServiceApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(EurekaRegisterServiceApplication.class, args);
	}
}
