package sample.tomcat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sample.tomcat.bean.LinuxEnvironment;

/**
 * @param
 * @author Joy
 * @date 2024/6/3
 */

@Configuration
public class ConditionConfig {
	/**
	 * 只有`@ConditionalOnLinux`的注解属性`environment`是"linux"时才会创建bean
	 *
	 * @return
	 */
	@Bean
	@ConditionalOnLinux(environment = "linux")
	public LinuxEnvironment linuxEnvironment() {
		return new LinuxEnvironment();
	}
}