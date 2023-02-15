package com.university.UniversityEventManagement.controller;


import com.university.UniversityEventManagement.model.Event;
import com.university.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/event-management")
public class EventController {

    @Autowired
    private EventService eventService;

    public  void EventController (EventController eventController){
        this.eventService=eventService;
    }

    // http://localhost:8080/api/vi/event-management/find-all-event
    @GetMapping("/find-all-event")
    public List<Event>findAllEvent(){
        return eventService.findAllEvent();
    }

    // http://localhost:8080/api/vi/event-management/find-event/id/3
    @GetMapping("/find-event/id/{id}")
    public Event findEventById(@PathVariable int id){
        return eventService.findEventById(id);
    }

    @PostMapping("/add-event-details")
    public void addEventDetails(@RequestBody Event event){
        eventService.addEventDetails(event);
    }

    @PutMapping("/update-event-details/id/{id}")
    public Event updateEventDetails(@PathVariable int id, @RequestBody Event event){
        eventService.updateEventDetails(id,event);
        return event;
    }

// http://localhost:8080/api/vi/event-management/delete-event-details/id/5
    @DeleteMapping("/delete-event-details/id/{id}")
    public void deleteEventDeails(@PathVariable int id) {
        eventService.deleteEventDetails(id);

    }

}
