package org.example.service;

import org.example.interfaces.StudentFactory;

public class ComputerScienceStudentFactory implements StudentFactory {

    @Override
    public BiologyStudent createStudent() { return new BiologyStudent();
    }
}
