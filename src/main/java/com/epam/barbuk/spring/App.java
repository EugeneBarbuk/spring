package com.epam.barbuk.spring;


import com.epam.barbuk.spring.beans.Client;
import com.epam.barbuk.spring.beans.ConsoleEventLogger;
import com.epam.barbuk.spring.beans.Event;
import com.epam.barbuk.spring.beans.FileEventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    Client client;
    EventLogger eventLogger;
    Event event;
    FileEventLogger fileEventLogger;

    public App(Client client, ConsoleEventLogger eventLogger, Event event, FileEventLogger fileEventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.event = event;
        this.fileEventLogger = fileEventLogger;
    }

    private void logEvent() {
        eventLogger.logEvent(event);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) applicationContext.getBean("app");
        app.logEvent();

    }
}
