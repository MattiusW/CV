package classinside;

public class Main 
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount(5000);

        System.out.println(bankAccount.getAccountState());
        
        bankAccount.start(5);

        System.out.println(bankAccount.getAccountState());
    }    
}

class BankAccount
{
    public BankAccount(double accountState)
    {
        this.accountState = accountState;
    }
    
    private double accountState;

    double getAccountState()
    {
        return this.accountState;
    }

    void start(double intrest)
    {
        Intrestrate intrestRates = new Intrestrate(intrest);
    }

    class Intrestrate
    {
        public Intrestrate(double intrestRate)
        {
            this.intrestRate = intrestRate;
            this.changeAccountState(intrestRate);
        }

        void changeAccountState(double intrest)
        {
            double intrestRate = (accountState * intrest) / 100;
            accountState += intrestRate; 
        }
    
        private double intrestRate;
    }
}
