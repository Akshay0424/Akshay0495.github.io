package com.practise;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemovalTest {

    @Test

    public void removeVowels1() throws Exception {

        String expectedValue[] ={"Ind"};
        //Act
        VowelRemoval vrem = new VowelRemoval();
        String actualValue[] = vrem.removeVowels(expectedValue);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test

    public void removeVowels2() throws Exception {

        String expectedValue[] ={"Grmny"};
        //Act
        VowelRemoval vrem = new VowelRemoval();
        String actualValue[] = vrem.removeVowels(expectedValue);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}