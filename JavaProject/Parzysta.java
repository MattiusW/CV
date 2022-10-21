public class Parzysta 
{

    public static void main(String[] args)
    {
	
	int x = 4;
	
        //Sprawdzanie parzystości liczby poprzez dzielenie modulo
        if (x % 2 == 0) //Jeżeli nie zostawia reszty z dzielenie liczba jest parzysta
	    System.out.println("parzysta");
	else //Jeżeli zostawia resztę z dzielenia to liczba jest nieparzysta
            System.out.println("nieparzysta");
        
        //Krótszy sposób zapisania instrukcji powyżej	
	String czyParzysta = x % 2 == 0 ? "PARZYSTA" : "NIEPARZYSTA";
	
	System.out.println(czyParzysta);
	
    }

}
