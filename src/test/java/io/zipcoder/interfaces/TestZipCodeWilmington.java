package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestZipCodeWilmington {

    String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };

    @Before
    public void setup() {
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void testHireStaff() {
            for(String i: instructorNames){
                Instructor instructor = new Instructor(i);
                ZipCodeWilmington.hire(instructor);
            }

            Assert.assertEquals(instructorNames.length, ZipCodeWilmington.getInstructorList().size());


    }

    @Test

    public void testFireStaff() {

        ArrayList<Instructor> expectedList = ZipCodeWilmington.getInstructorList();
        Assert.assertTrue(expectedList.isEmpty());
    }





}
