package me.renzheng.hello.world.spring.boot.starter.service.impl;

import me.renzheng.hello.world.spring.boot.starter.service.HelloWorldService;

import java.util.Objects;

/**
 * HelloWorldServiceImpl
 *
 * @author Renzheng Zhang
 * @date 2023/3/22
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String sayHi(String name) {
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("name is empty.");
        }

        return "Hello, " + name + "!";
    }
}
