/* package controller;

import entity.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@AllArgsConstructor

public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("{id}")
    public Course getCourseById(@PathVariable Long id) {
        return service.getCourseById(id);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    @PostMapping
    public Course addCourse(@RequestBody Course request) {
        return service.createCourse(request);
    }

    @PutMapping("{id}")
    public Course updateCourse(@RequestBody Course request, @PathVariable Long id) {
        return service.update(request, id);
    }

    @DeleteMapping("{id}")
    public void deleteCourse(@PathVariable Long id) {
        service.delete(id);
    }


}

 */
