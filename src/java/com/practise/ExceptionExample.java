package com.practise;

    public class ExceptionExample
    {

        public static void main(String args[])
        {
            //NegativeArraySizeException
            int arrSize = -8;
            try
            {
                int[] myArray = new int[arrSize];
                String ex="hello";
            }
            catch (NegativeArraySizeException ex)
            {
                System.out.println("Can't create array of negative size" + ex);
            }

            //ArrayIndexOutOfBoundsException
            int marks[] = {  1, 2, 3,4 };

            try
            {
                System.out.println(marks[2]);
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                //System.out.println("Wrong index number, please enter correct number. " + e);
                System.out.println(e);
            }

            //NullPointerException

            String str=null;

            try
            {
                if(str.equals("hey"))
                    System.out.println("hey");
            }
            catch (NullPointerException ex)
            {
                //System.out.print("NullPointerException Caught " + ex);
                System.out.println(ex);
            }
        }
    }