package com.epam.barbuk.spring.beans;

import com.epam.barbuk.spring.EventLogger;
import org.springframework.stereotype.Component;

@Component
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event){
        System.out.println(event);
    }
}
