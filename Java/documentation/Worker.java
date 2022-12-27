package documentation;

/**
 * Object <code>Worker</code> represent Worker
 */
public class Worker
{   
    /**
     * Constructor default
     * @deprecated 
     */
    public Worker(){}
    /**
     * Constructor making object <code>Worker</code> with name and surname
     * @param name set name
     * @param surname set surname
     */
    public Worker(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Constructor making object <code>Worker</code> with name, surname and income
     * @param name set name
     * @param surname set surname
     * @param income set income
     */
    
    public Worker(String name, String surname, double income)
    {
        this(name, surname);
        this.income = income;
    }

    /**
     * <pre>
     * How to use:
     * Worker p = new Worker();
     * p.setIncome(1000);
     * @param newIncome set new income of worker
     * </pre>
     */
    public void setIncome(double newIncome)
    {
        this.income = newIncome;
    }

    /**
     * @since 1.0.0.0
     * @return return income in double type
     */
    public double getIncome()
    {
        return this.income;
    }
    /**
     * Worker name
     */
    private String name;
    /**
     * Worker surname
     */
    private String surname;
    /**
     * Worker income
     */
    private double income;
}