package com.geoffrey.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.geoffrey.sms.entity.Student;
import com.geoffrey.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Mark","John","markjohn@gmail.com");
		 * studentRepository.save(student1); Student student2 = new
		 * Student("Jane","Lisa","janelisa@gmail.com");
		 * studentRepository.save(student2); Student student3 = new
		 * Student("Stephen","Doe","stephendoe@gmail.com");
		 * studentRepository.save(student3);
		 */
				
	}

}
