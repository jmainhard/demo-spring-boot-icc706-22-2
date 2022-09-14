package dci.ufro.demospringbooticc706.controller;

import dci.ufro.demospringbooticc706.model.Course;
import dci.ufro.demospringbooticc706.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> get() {
        return courseRepository.findAll();
    }


}
