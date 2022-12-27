package documentation;

/**
 * @author Mateusz
 * @version 1.0.4.2 27/12/2022
 */

public class Main
{
    public static void main(String[] args)
    {
        double oldIncome;
        double newIncome;

        Worker p = new Worker("Mariusz", "Buma", 1000.00);
        oldIncome = p.getIncome();
        p.setIncome(1500.00);
        newIncome = p.getIncome();
        System.out.print("Old income: " + oldIncome + " " + "New income: " + newIncome);
    }
}
