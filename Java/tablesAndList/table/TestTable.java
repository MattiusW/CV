package tablesAndList.table; 

import java.util.Arrays;  // Import class Array 

public class TestTable
{
    public static void main(String[] args)
    {
        int[] table = new int[5];
        int[] array = { 3, 4, 5};

        for(int i = 0; i < table.length; i++)
        {
            table[i] += i;
            System.out.println(table[i]);
        }
        
        System.out.println(Arrays.toString(table)); // Print whole content of table
        System.out.println(Arrays.toString(array));
    }
}
