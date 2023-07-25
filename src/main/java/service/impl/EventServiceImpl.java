package service.impl;

import entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EventRepository;
import service.EventService;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository repo;

    @Override
    public Event createEvent(Event event) {
        return null;
    }

    @Override
    public Event getEventById(Long eventId) {
        return null;
    }

    @Override
    public void delete(Long eventId) {

    }

    @Override
    public Event update(Event event, Long eventId) {
        return null;
    }

    @Override
    public List<Event> getAllEvents() {
        return null;
    }
}
