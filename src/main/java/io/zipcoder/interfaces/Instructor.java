package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(name);
    }

    public Instructor(String instructorName) {
        super(instructorName);
    }


    @Override
    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);


    }

    @Override
    public void lecture(Student[] students, double numberOfHours) {
        for(Student S: students){
            S.learn(numberOfHours/students.length);
        }

    }
}
