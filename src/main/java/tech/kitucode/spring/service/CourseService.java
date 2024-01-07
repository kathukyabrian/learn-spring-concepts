package tech.kitucode.spring.service;

import org.springframework.stereotype.Service;
import tech.kitucode.spring.domain.Course;
import tech.kitucode.spring.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CrudService<Course> {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @Override
    public Course save(Course course) {
        this.courseRepository.findAll().add(course);
        return course;
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> findOne(Integer id) {
        for (Course course : courseRepository.findAll()) {
            if (course.getId().equals(id)) {
                return Optional.of(course);
            }
        }
        return Optional.empty();
    }
}
