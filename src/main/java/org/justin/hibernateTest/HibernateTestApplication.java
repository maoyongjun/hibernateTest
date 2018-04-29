package org.justin.hibernateTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
* @author:myz
* @version 1.0 
* ����ʱ�䣺2018��4��29�� ����8:12:34
*/
@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.justin.hibernateTest.dao")
@EntityScan(basePackages = "org.justin")
public class HibernateTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(HibernateTestApplication.class,args);
	}
}
