package com.practise;
import java.util.*;

public class StudentMarks {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int i;
        int[] stuGrades = new int[numOfStudents];

        for (i = 0; i < stuGrades.length; i++) {
            stuGrades[i] = sc.nextInt();
        }

    }

    public Boolean checkMarks(int marks) {

        if(marks>=0 && marks<=100)
            return true;
        else
            return false;

    }

}
