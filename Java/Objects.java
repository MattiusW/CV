public class Objects
{
    public static void main(String[] args)
    {
        Monitor samsung = new Monitor(); 
        Monitor sony = new Monitor(); // Create objects   
        
	samsung.width = 30;
	samsung.length = 40;
                                   
	sony.width = 20;
	sony.length = 15;     //Refer to objects and assign new value
	
	samsung.off();
	sony.on();            //Refer to method in class
	
     	System.out.println("Width: " + samsung.width + " Length: " + samsung.length);	
     	System.out.println("Width: " + sony.width + " Length: " + sony.length);	
    }
}

class Monitor //Create class 
{
    int width;  
    int length; 	

    void on()
    {
        System.out.println("Monitor is turn on");
    }
    
    void off()
    {
        System.out.println("Monitor is turn off"); //Create method in class
    }
}
    

