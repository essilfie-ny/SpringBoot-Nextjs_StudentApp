package com.nanayaw.studentbackend.repository;

import com.nanayaw.studentbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}