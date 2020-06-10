package main.children;

import main.Teachers.Teacher;
import main.subjects.Subject;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Alunis")
public class Alunis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastname;
    private int schoolYear;
    private int age;
    private int workload = 45;

    @OneToMany(cascade = {CascadeType.ALL},
            mappedBy = "Alunis",
            fetch = FetchType.EAGER)
    private HashSet<Teacher> teachers = new HashSet<>();

    private Set<Subject> subjects = new HashSet<>();

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

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}
