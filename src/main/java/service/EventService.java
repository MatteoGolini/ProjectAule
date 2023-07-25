package service;


import entity.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event event);

    Event getEventById(Long eventId);

    void delete(Long eventId);

    Event update(Event event, Long eventId);

    List<Event> getAllEvents();


}
