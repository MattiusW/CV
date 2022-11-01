public class Methods 
{
    public static void main(String[] args)
    {
        Test object = new Test(); //Create constructor
        object.printNameOnScreen("Mateusz"); //Send to method
    
        int total = object.add(20, 9);
        System.out.println(total);

        double totalDouble = object.add(15.5, 3.2);
        System.out.println(totalDouble);

        double totalOdd = object.odd(10, 2); //Send to method
        System.out.println(totalOdd); 

        double divisonByZero = object.odd(6, 0); //Send to method
        System.out.println(divisonByZero); 
    }        
}

class Test
{
    void printNameOnScreen(String imie) //Create method and parameters
    {
        System.out.println(imie);
    }

    int add(int a, int b)
    {
        return a + b;
    }
    
    double add(double a, double b) //Need create new method if want send type double to method add
    {
        return a + b;
    }

    double odd(double a, double b)
    {
        if(b == 0)
        {
            System.out.println("Don't division by zero!");
            return b; //Method must return type double
        }
        
        return a / b;  
    }
}

