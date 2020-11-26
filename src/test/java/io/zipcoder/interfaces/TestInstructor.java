package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    Instructor instructor = new Instructor(266, "Sushim");
    Student student = new Student( "Shubham");


    @Test
    public void testInstructor() {


        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {

        //given
        double expectedNumOfHours = 10;

        //when
        instructor.teach(student, expectedNumOfHours);
        double actualNumOfHours = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expectedNumOfHours, actualNumOfHours, 0.001);

    }

    @Test
    public void testLecture() {

        //given
        double expectedHrs = 10;
        Student s1 = new Student( "bob");
        Student s2 = new Student( "mary");
        Student[] students = {student, s1, s2};

        //when
        instructor.lecture(students, expectedHrs);
        double actualHrs = student.getTotalStudyTime() * students.length;

        //then
        Assert.assertEquals(expectedHrs, actualHrs, 0.001);
    }


}
