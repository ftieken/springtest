package com.manning.sbip.ch03.service;

import com.manning.sbip.ch03.model.Course;
import java.util.Optional;

public interface CourseService {

    Course createCourse(Course course);

    Optional<Course> getCourseById(long courseId);

    Iterable<Course> getCoursesByCategory(String category);

    Iterable<Course> getCourses();

    Course updateCourse(long courseId, Course course);

    void deleteCourseById(long courseId);

    void deleteCourses();
}
