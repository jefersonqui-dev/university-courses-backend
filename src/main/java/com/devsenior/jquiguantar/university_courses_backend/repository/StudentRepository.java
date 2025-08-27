package com.devsenior.jquiguantar.university_courses_backend.repository;

import com.devsenior.jquiguantar.university_courses_backend.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
