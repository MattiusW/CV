package zegarek;

class Zegarek {
    private int godzina = 0;
    private int minuty = 0;
    private int sekundy = 0;
  
    public Zegarek(int godz, int min, int sek) {
      godzina = godz;
      minuty = min;
      sekundy = sek;
    }
  
    public boolean ustawGodz(int godz) //Boolean(Czy) pytanie tak albo nie?
    {
      if (godz >= 0 && godz <= 23)
      {  
        godzina = godz;
        return true;
      }
      else
        System.err.println("Nieprawidłowa wartość godziny: " + godz);
        return false;
    }
    
    public void zmienSec(int sekund)
    {
      sekundy += sekund;
      if (sekundy > 59)
      {  
        minuty += 1;
        sekundy -= 60;
      }
    }
      
    public void wypisz() {
      System.out.print(godzina + ":" + minuty + ":" + sekundy);
    }
  
    public void wypiszln() 
    {
      wypisz();  //Można wywołać metodę w metodzie
      System.out.println();
    }
    
    public Zegarek() 
    {
  
    }
  
  }
