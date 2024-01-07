package tech.kitucode.spring.repository;

import org.springframework.stereotype.Repository;
import tech.kitucode.spring.domain.Course;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements CrudRepository<Course> {
    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        Course springBoot = new Course(1,
                "Getting Started with spring boot",
                "learn how to build real applications with spring",
                "https://test.com");
        courses.add(springBoot);
        return courses;
    }
}
