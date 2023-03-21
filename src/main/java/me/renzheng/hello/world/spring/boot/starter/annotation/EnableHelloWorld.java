package me.renzheng.hello.world.spring.boot.starter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * EnableHelloWorld
 *
 * @author Renzheng Zhang
 * @date 2023/3/22
 */
@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableHelloWorld {

}
