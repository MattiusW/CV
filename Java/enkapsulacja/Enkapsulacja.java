package enkapsulacja;

public class Enkapsulacja
{
    public static void main(String[] args)
    {
        KontoBankowe oszczednosciowe = new KontoBankowe();
        oszczednosciowe.setSaldo(11001);
        if (oszczednosciowe.wyplata(1000))
        {
            System.out.println("Wypłacono");
        }
        else
            System.out.println("Masz za mało pieniędzy");
        System.out.println(oszczednosciowe.getSaldo());
        oszczednosciowe.wplata(20000);
        System.out.println(oszczednosciowe.getSaldo());

    }
}

class KontoBankowe
{
    public KontoBankowe()
    {
        saldo = 10000;
    }

    private int saldo;

    int getSaldo()
    {
        return saldo;
    }

    void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }
    
    boolean wyplata(int ile)
    {
        if (saldo < ile)
            return false;
        else 
            setSaldo(saldo - ile);
        
        return true;
    }
    boolean wplata(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }
}