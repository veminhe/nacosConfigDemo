package org.example;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author heming
 * @since 2023/6/25 19:06
 */
@MapperScan(basePackages = {"org.example.mapper"})
@SpringBootApplication(scanBasePackages = {
        "org.example"},
        exclude = {DruidDataSourceAutoConfigure.class})
@EnableDiscoveryClient
public class NacosTestApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosTestApplication.class, args);
        while (true) {
            String name = applicationContext.getEnvironment().getProperty("config.name");
            String post = applicationContext.getEnvironment().getProperty("server.port");
            System.out.println("name :"+name);
            System.out.println("post :"+post);
            // 每一秒加载一次，查询注册中心配置是否变更
            TimeUnit.SECONDS.sleep(2);
        }
    }

}
