package main.subjects.subFactory;

import main.subjects.*;
import main.subjects.Math;

public class subFactory {

    public static Subject createSubject(SubjectsEnum subject) {

        switch (subject) {
            case PE:
                return new PE();
            case TIC:
                return new Tic();
            case MATH:
                return new Math();
            case FRENCH:
                return new French();
            case ENGLISH:
                return new English();
            case PHYSICS:
                return new Physics();
            case SCIENCE:
                return new Science();
            default:
                return new Quimistery();

        }
    }
}
