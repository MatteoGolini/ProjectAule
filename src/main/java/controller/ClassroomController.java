package controller;

import entity.Classroom;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ClassroomService;

import java.util.List;

@RestController
@RequestMapping("classroom")
@AllArgsConstructor

public class ClassroomController {

    @Autowired
    private ClassroomService service;

    @GetMapping("{id}")
    public Classroom getClassroomById(@PathVariable Long id) {
        return service.getClassroomById(id);
    }

    @GetMapping
    public List<Classroom> getAllClassrooms() {
        return service.getAllClassrooms();
    }

    @PostMapping
    public Classroom addClassroom(@RequestBody Classroom request) {
        return service.createClassroom(request);
    }

    @PutMapping("{id}")
    public Classroom updateClassroom(@RequestBody Classroom request, @PathVariable Long id) {
        return service.update(request, id);
    }

    @DeleteMapping("{id}")
    public void deleteClassroom(@PathVariable Long id) {
        service.delete(id);
    }


}