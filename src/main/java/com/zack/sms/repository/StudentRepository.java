package com.zack.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zack.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	

}
