package controller;

import entity.Group;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.GroupService;

import java.util.List;

@RestController
@RequestMapping("group")
@AllArgsConstructor

public class GroupController {

    @Autowired
    private GroupService service;

    @GetMapping("{id}")
    public Group getGroupById(@PathVariable Long id) {
        return service.getGroupById(id);
    }

    @GetMapping
    public List<Group> getAllGroups() {
        return service.getAllGroups();
    }

    @PostMapping
    public Group addGroup(@RequestBody Group request) {
        return service.createGroup(request);
    }

    @PutMapping("{id}")
    public Group updateGroup(@RequestBody Group request, @PathVariable Long id) {
        return service.update(request, id);
    }

    @DeleteMapping("{id}")
    public void deleteGroup(@PathVariable Long id) {
        service.delete(id);
    }


}