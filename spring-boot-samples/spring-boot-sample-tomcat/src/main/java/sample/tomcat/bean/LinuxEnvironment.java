package sample.tomcat.bean;

import org.springframework.core.env.Environment;

import java.io.Serializable;

/**
 * @author Joy
 * @date 2024/6/3
 * @param
 *
 */

public class LinuxEnvironment implements Serializable {

	private String name;

	public LinuxEnvironment() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
