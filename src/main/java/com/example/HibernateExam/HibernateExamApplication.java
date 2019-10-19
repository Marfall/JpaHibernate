package com.example.HibernateExam;

import com.example.HibernateExam.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

@SpringBootApplication
public class HibernateExamApplication {

	public static void main(String[] args) {

		SpringApplication.run(HibernateExamApplication.class, args);
		System.out.println("Hello!");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookUnit");
		EntityManager em = emf.createEntityManager();

		// Book book = new Book("main");
		Student student = new Student();
		student.name = "Max";
		student.age() = 22;
		student.birth = new Date();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(book);
		tx.commit();

		em.close();
		emf.close();
	}

}
