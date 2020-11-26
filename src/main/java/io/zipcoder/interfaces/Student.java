package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student( String name) {
        super( name);
    }

    @Override
    public void learn(double numOfHours) {
        totalStudyTime += numOfHours;

    }


    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
