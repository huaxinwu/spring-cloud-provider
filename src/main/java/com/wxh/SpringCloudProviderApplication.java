package com.wxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  1. pom添加依赖配置
 *  2. application配置服务端口、名称等信息
 *  3. 在启动类使用注解EnableDiscoveryClient，启用服务注册与发现
 *  4. 编写提供服务Controller，实现相关业务
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderApplication.class, args);
	}
}
