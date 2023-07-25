package controller;

import entity.Event;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EventService;

import java.util.List;

@RestController
@RequestMapping("classroom")
@AllArgsConstructor

public class EventController {

    @Autowired
    private EventService service;

    @GetMapping("{id}")
    public Event getEventById(@PathVariable Long id) {
        return service.getEventById(id);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return service.getAllEvents();
    }

    @PostMapping
    public Event addEvent(@RequestBody Event request) {
        return service.createEvent(request);
    }

    @PutMapping("{id}")
    public Event updateEvent(@RequestBody Event request, @PathVariable Long id) {
        return service.update(request, id);
    }

    @DeleteMapping("{id}")
    public void deleteEvent(@PathVariable Long id) {
        service.delete(id);
    }


}