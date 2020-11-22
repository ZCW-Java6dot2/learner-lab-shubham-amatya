package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    Student student = new Student(266,"Sushim");

    @Test

    public void testImplementation(){ //testImplementation method that asserts that a Student is an instanceof Learner

               Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){   //method that asserts that a Student is an instanceof a Person.
                Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){ //method that ensures a Student's totalStudyTime instance variable is
                              // incremented by the specified numberOfHours by invoking the .learn method.

        //given
        double expectedNumOfHrs =  10;

        //when
         student.learn(expectedNumOfHrs);
         double actualNumOfHrs = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expectedNumOfHrs,actualNumOfHrs, 0.001 );

    }

}
