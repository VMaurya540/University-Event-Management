package com.university.UniversityEventManagement.service;

import com.university.UniversityEventManagement.model.Event;
import com.university.UniversityEventManagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    public static List<Event>events = new ArrayList<>();

    private static int eventId = 0;

    static {

        events.add(new Event(++eventId,"Triveni Hotel","Prayagraj","2022/02/05",
                "03:00 PM","06:00 AM","https://www.universestudio.in/gallery/"));
        events.add(new Event(++eventId,"Laxmi Palace","Varansi","2024/03/05",
                "03:00 PM","06:00 AM","https://www.universestudio.in/gallery/"));
        events.add(new Event(++eventId,"Paradise Hotel","Lucknow","2025/02/05",
                "03:00 PM","06:00 AM","https://www.universestudio.in/gallery/"));
        events.add(new Event(++eventId,"Triveni Hotel","Delhi","2026/02/05",
                "03:00 PM","06:00 AM","https://www.universestudio.in/gallery/"));
        events.add(new Event(++eventId,"Hotel Punjab Inn","Punjab","2027/02/05",
                "03:00 PM","06:00 AM","https://www.universestudio.in/gallery/"));

    }

    public List<Event> findAllEvent() {
        return events;
    }


    public Event findEventById(int id) {
        for (Event event : events) {
            if (event.getEventId() == id) {
                return event;
            }
        }
        return null;
    }


    public void addEventDetails(Event event) {
        events.add(event);
    }

    public void updateEventDetails(int id, Event event) {

        for (int i = 0; i < events.size(); i++) {
            Event event1 = events.get(i);
            if (event1.getEventId() == id) {
                events.set(i, event);
                return;
            }
        }
    }



    public void deleteEventDetails(int id) {

            for (int i = 0;i<events.size();i++){
               Event event = events.get(i);
                if (event.getEventId()==id){
                    events.remove(i);
                    return;
                }
            }
        }
    }


