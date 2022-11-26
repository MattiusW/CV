package interfejs;

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println(nazwaInterfejsu.PI);

        int[] tab = new int[3];

        tab[0] = 7;
        tab[1] = 5;
        tab[2] = 10;

        Arrays.sort(tab);
        
        Pracownik[] pracownicy = new Pracownik[3];
        pracownicy[0] = new Pracownik(10000);
        pracownicy[1] = new Pracownik(15000);
        pracownicy[2] = new Pracownik(15000);

        System.out.println(tab[0]);
        System.out.println(pracownicy[0].compareTo(pracownicy[1]));

    }   
}

interface nazwaInterfejsu
{
    double PI = 3.14; //public static final

    void cos();  //public abstract
}

class Pracownik implements nazwaInterfejsu, Comparable
{
    @Override
    public void cos()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Pracownik(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    
    private double wynagrodzenie;
    
    @Override
    public int compareTo(Object o) 
    {
        Pracownik przyslany = (Pracownik)o;
        if (this.wynagrodzenie < przyslany.wynagrodzenie)
            return -1;
        else if (this.wynagrodzenie > przyslany.wynagrodzenie)
            return 1;
        
        return 0;        
    }
}