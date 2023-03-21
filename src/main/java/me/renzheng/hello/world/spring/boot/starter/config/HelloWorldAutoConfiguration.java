package me.renzheng.hello.world.spring.boot.starter.config;

import me.renzheng.hello.world.spring.boot.starter.annotation.EnableHelloWorld;
import me.renzheng.hello.world.spring.boot.starter.service.HelloWorldService;
import me.renzheng.hello.world.spring.boot.starter.service.impl.HelloWorldServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorldAutoConfiguration
 *
 * @author Renzheng Zhang
 * @date 2023/3/22
 */
@Configuration
@ConditionalOnBean(annotation = {EnableHelloWorld.class})
public class HelloWorldAutoConfiguration {

    @Bean
    HelloWorldService helloWorldService() {
        return new HelloWorldServiceImpl();
    }
}
