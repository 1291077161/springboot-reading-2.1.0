/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.xml;

import java.util.Collections;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import sample.xml.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

/**
 * @author Joy
 * @date 2024/6/3
 * @param
 *
 */

public class SampleSpringXmlApplication implements CommandLineRunner {

	private static final String CONTEXT_XML = "classpath:/META-INF/application-context.xml";

	private static Log logger = LogFactory.getLog(SampleSpringXmlApplication.class);

	@Autowired
	private HelloWorldService helloWorldService;

	@Override
	public void run(String... args) {
		logger.info("this is a joke:");
		System.out.println(this.helloWorldService.getHelloMessage());
		System.out.println("\"this is a joke:\" = " + "this is a joke:");
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication();
		application.setSources(Collections.singleton(CONTEXT_XML));
		application.run(args);
	}

}
