package com.epam.barbuk.spring.beans;

import com.epam.barbuk.spring.EventLogger;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class FileEventLogger implements EventLogger
{
    private String fileName;

    public FileEventLogger(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void logEvent(Event event)
    {
        final File file = new File(fileName);
        try {
            FileUtils.writeStringToFile(file, "content", "ISO-8859-1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
