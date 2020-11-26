package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTechConnect {
    String[] studentNames = {"Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
            "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
            "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
            "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
            "Cristine", "Brendan"};

    @Before
    public void setUp() {
        TechConnect.removeStudents();
    }

    @Test
    public void testRecruitStudents() {
        for (String studentName : studentNames) {
            Student student = new Student(studentName);
            TechConnect.recruitStudent(student);
        }

        Assert.assertEquals(studentNames.length, TechConnect.getStudentList().size());

    }

    @Test
            public void testRemoveStudents(){

        Assert.assertTrue(TechConnect.getStudentList().isEmpty());
        }




}