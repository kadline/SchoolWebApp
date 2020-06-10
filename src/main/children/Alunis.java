package main.children;

import main.subjects.Subject;

public class Alunis {

    private String firstName;
    private String lastname;
    private int schoolYear;
    private int age;
    private int workload = 45;
    private Subject[] subjects;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public void addSubject(Subject subject){
        for(int i = 0; i<subjects.length; i++){
            subjects[i] = subject;
        }
    }
}
