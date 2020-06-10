package main.Teachers;

import main.children.Alunis;
import main.subjects.Subject;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

public class Teacher {

    private String firstName;
    private String lastName;
    private Subject subject;

    @OneToMany
    private Set<Alunis> alunis = new HashSet<>();

    private int workload = 45;

    public Teacher(String firstName, String lastName, Subject subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public void addAlunis(Alunis alunis){
        this.alunis.add(alunis);
    }
}
