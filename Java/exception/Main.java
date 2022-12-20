package exception;

class MyException extends Exception  //Class my exception which I made must be above class Main 
{
    public MyException(String string)
    {
        super(string);
    }
}

public class Main
{   
    public static void main(String[] agrs)
    {
        
        try
        {
            System.out.println(5 / 0);
            System.out.println("This instruction doesn't work after exception");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Exception warning: " + ex.getMessage());
        }
        finally
        {
            System.out.println("Block Finally working always even after exception");
        }

        //Try input good value 
        try
        {
            multiply(10);
        }
        catch(MyException ex)
        {
            System.out.println(ex.getMessage());
        }

        //Catch exception method
        try     
        {
            multiply(0);
        }
        catch(MyException ex)
        {
            System.out.println(ex.getMessage());
        }
                
    }

    static void multiply(int x) throws MyException
    {
        int countMultiply = 1;
        if (x != 0)
        {
            for(int i = 0; i < 10; i++)
            {
                countMultiply = x * i;
                System.out.println(countMultiply);
            }   
        }
        else
            throw new MyException("Don't multiply by 0 because amount all will be 0"); //Throw exception in method
      
    }
    
}