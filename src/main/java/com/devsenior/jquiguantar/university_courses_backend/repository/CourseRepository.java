package com.devsenior.jquiguantar.university_courses_backend.repository;

import com.devsenior.jquiguantar.university_courses_backend.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
