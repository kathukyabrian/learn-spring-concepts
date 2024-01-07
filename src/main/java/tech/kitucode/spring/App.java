package tech.kitucode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.kitucode.spring.config.AppConfig;
import tech.kitucode.spring.service.CourseService;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService courseService = context.getBean("courseService", CourseService.class);
        System.out.println(courseService.findAll());
    }
}
