public class Statycznosc
{
    public static void main(String[] args)
        {   
	    double wynik = Matematyka.dodaj(10, 15); //Dzięki statyczności można bezpośrednio odwołać sie do metody w klasie    
		
	    //Matematyka test = new Matematyka();
	    //double wynik = test.dodaj(10, 20); //Nie potrzebujemy tworzyć instancji
	    System.out.println(wynik);
	    System.out.println(Matematyka.PI);
	}
}
class Matematyka
{   
    static final double PI = 3.14;
    static double dodaj(double a, double b) //Nadanie statyczności metodzie
    {
        return a + b;
    }
}

