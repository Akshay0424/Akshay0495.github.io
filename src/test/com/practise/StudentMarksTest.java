package com.practise;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    @Test
    public void checkMarks1() {

        boolean expectedValue=true;
        StudentMarks obj = new StudentMarks();
        //Act
        boolean actualValue = obj.checkMarks(92);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void checkMarks2() {

        boolean expectedValue=false;
        StudentMarks obj = new StudentMarks();
        //Act
        boolean actualValue = obj.checkMarks(121);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void checkMarks3() {

        boolean expectedValue=false;
        StudentMarks obj = new StudentMarks();
        //Act
        boolean actualValue = obj.checkMarks(-3);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}