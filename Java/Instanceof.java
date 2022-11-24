public class Instanceof 
{
    public class Main 
    {
        public static void main(String[] args)
        {
            Osoba[] osoba = new Osoba[4];
            osoba[0] = new Pracownik("Mateusz", "W", 100000);
            osoba[1] = new Student("Kamil", "Kzesiu");

            for (int i = 0; i < osoba.length; i++)
            {
                if (osoba[i] instanceof Osoba)   //Sprawdza czy jest egzemplarzem klasy
                    osoba[i].pobierzOpis();
                else
                    break;
            }

        }
    }    
}
abstract class Osoba
{
    String imie;
    String nazwisko;

    Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void pobierzOpis();

}

class Pracownik extends Osoba
{
    double wynagrodzenie;
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis()
    {
        System.out.println("Jestem inżynierem");
        System.out.println("Moję imię to: " + imie);
        System.out.println("Moje zarobki to: " + wynagrodzenie);
    }
}

class Student extends Osoba
{
    Student(String imie, String nazwisko)
    {
        super(imie, nazwisko);
    }
    
    @Override
    void pobierzOpis()
    {
        System.out.println("Jestem wiecznym studentem");
        System.out.println("Nazywam się: " + imie + " " + nazwisko);
    }
}