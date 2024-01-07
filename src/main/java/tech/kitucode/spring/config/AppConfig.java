package tech.kitucode.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tech.kitucode.spring.repository.CourseRepository;
import tech.kitucode.spring.service.CourseService;

@Configuration
@ComponentScan("tech.kitucode.spring")
public class AppConfig {

//    @Bean
//    public CourseRepository getCourseRepository() {
//        return new CourseRepository();
//    }
//
//    @Bean
//    public CourseService getCourseService() {
//        return new CourseService(getCourseRepository());
//    }
}
