package sample.tomcat.config;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @param
 * @author Joy
 * @date 2024/6/3
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(LinuxCondition.class)
public @interface ConditionalOnLinux {
	// 标注是哪个环境
	String environment() default "";

}