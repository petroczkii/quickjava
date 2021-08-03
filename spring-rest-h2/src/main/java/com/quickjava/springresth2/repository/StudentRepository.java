package com.quickjava.springresth2.repository;

import com.quickjava.springresth2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("select s from Student s where s.lastName = :lastName")
	List<Student> findStudentsByLastName(@Param("lastName") String lastName);

	List<Student> findByLastName(String lastName);

}
