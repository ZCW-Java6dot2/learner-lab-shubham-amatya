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
        Person person = new Person(expectedId, expectedName);

        //then
        long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

}
