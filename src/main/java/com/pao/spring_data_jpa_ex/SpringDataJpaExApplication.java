package com.pao.spring_data_jpa_ex;

import com.pao.spring_data_jpa_ex.model.Student;
import com.pao.spring_data_jpa_ex.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaExApplication.class, args);

	}

}
