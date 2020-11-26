package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test

    public void testSetName(){
        String givenName = "Sushim";

        Person person = new Person(givenName);
        String expectedName = person.getName();
        Assert.assertEquals(givenName, expectedName);
    }



}
