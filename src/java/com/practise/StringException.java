package com.practise;

public class StringException extends Exception
{
    public StringException(String s)

    {
        super(s);
    }

    public static void main(String args[])
    {
        try
        {
            // Throw an object of user defined exception
            throw new Exception("Exception is thrown");
        }

        catch (StringException ex)
        {
            System.out.println("Caught the exception");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        finally
        {
            System.out.println("Final block");
        }
    }

}