public class Objekty 
{
    public static void main(String[] args)
    {   
        Punkt p1 = new Punkt(4, 10);
        Punkt p2 = new Punkt(4, 10);

        System.out.println(p1.equals(p2));
        System.out.println(p1.getClass());
        
        if (p1.equals(p2))
            System.out.println("Obiekty są sobie równe");

        Object[] punkty = new Punkt[4];

        punkty[0] = new Punkt(1,2);
        punkty[1] = new Punkt(3,4);
        punkty[2] = new Punkt(5,6);
        punkty[3] = new Punkt(7,8);
        
        for(int i = 0; i < punkty.length; i++)
        {
            System.out.println(punkty[i]);
        }

    }
}

class Punkt
{
    private int x;
    private int y;

    Punkt()
    {

    }
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    @Override
    public boolean equals(Object o)
    {   
        if (this == o)                                             
            return true;            
        else if (o == null) 
            return false;
        else if (this.getClass() != o.getClass())       
            return false;
        
        Punkt przyslany = (Punkt)o;

        return this.x == przyslany.x && this.y == przyslany.y;
    }
    @Override
    public String toString()  //Wypisanie wartości, bez wywołania metod 
    {
        return getX() + " " + getY();
    }
}