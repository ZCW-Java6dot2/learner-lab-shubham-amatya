package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numOfHours) {
        totalStudyTime += numOfHours;

    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
