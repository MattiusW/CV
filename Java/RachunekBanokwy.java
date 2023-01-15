class RachunekBankowy 
{
    private static double rocznaStopaProcentowa;
    private double saldo;
  
    public static void main(String[] args) 
    {
      RachunekBankowy saver1 = new RachunekBankowy(2000);
      saver1.setRocznaStopaProcentowa(4);
      saver1.obliczMiesieczneOdsetki();
      System.out.println("Stan konta saver1: " + saver1);
      RachunekBankowy saver2 = new RachunekBankowy(3000);
      saver2.setRocznaStopaProcentowa(5);
      saver2.obliczMiesieczneOdsetki();
      System.out.println("Stan konta saver2: " + saver2);
    }
  
    RachunekBankowy(double noweSaldo) 
    {
      saldo = noweSaldo;
    }
  
    public double obliczMiesieczneOdsetki() 
    {
      double odsetki = saldo * rocznaStopaProcentowa / 12 / 100;
      saldo += odsetki;
      return odsetki;
    }
  
    public static void setRocznaStopaProcentowa(double nowaStopaProcentowa) 
    {
      if (nowaStopaProcentowa > 0) {
        rocznaStopaProcentowa = nowaStopaProcentowa;
      } 
      
      else 
      {
        System.err.println("Nie prawidłowa wartość");
        System.exit(1);
      }
    }
  
    public String toString() 
    {
      return "" + saldo;
    }
  }
  