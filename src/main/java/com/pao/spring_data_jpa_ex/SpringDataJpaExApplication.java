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
//		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

//		StudentRepo repo = context.getBean(StudentRepo.class);



//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setName("pao1");
//		s1.setMarks(1);
//		s1.setRollNo(10);
//
//		repo.save(s1);

//		s2.setName("pao3");
//		s2.setMarks(1);
//		s2.setRollNo(10);
//
//		repo.delete(s2);

	}

}
