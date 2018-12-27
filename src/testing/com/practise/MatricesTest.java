package com.practise;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatricesTest {


    @Test
    public void add1() {

        int a[][] = {{2, 2}, {3, 3}};
        int b[][] = {{4, 4}, {5, 5}};
        int rows = 2, columns = 2;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        int[][] expectedValue={{6,6},{8,8}};
        int[][] actualValue =result;
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void add2() {

        int a[][] = {{1,1}, {2, 2},{3,3}};
        int b[][] = {{4, 4}, {5, 5},{6,6}};
        int rows = 3, columns = 2;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        int[][] expectedValue={{5,5},{7,7},{9,9}};
        int[][] actualValue =result;
        assertEquals(expectedValue, actualValue);

    }
}