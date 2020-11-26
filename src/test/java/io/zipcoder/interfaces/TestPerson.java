package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test

    public void testPerson(){
        //Given
        long expectedId = 123;
        String expectedName = "taki";

        //when
        Person person = new Person(expectedName);

        //then

        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }

}
