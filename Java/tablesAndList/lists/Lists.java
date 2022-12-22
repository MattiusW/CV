package tablesAndList.lists;
// Import necessary classes to operate on lists
import java.util.List;    
import java.util.LinkedList;

public class Lists
{
    public static void main(String[] args)
    {
        List<Double> items = new LinkedList<>();

        double j = 10.00;
        for(int i = 0; i < 4; i++)
        {
            j += 20.00;
            items.add(j);  // Add value to list
            System.out.println(j);
        }
        
        System.out.println(items); // Print content of list

    }
}