package dci.ufro.demospringbooticc706.repository;

import dci.ufro.demospringbooticc706.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
