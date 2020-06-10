package main.Teachers;

import main.subjects.Subject;

public class Teacher {

    private String firstName;
    private String lastName;
    private Subject subject;
    private int workload = 45;

    public Teacher(String firstName, String lastName, Subject subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
}
