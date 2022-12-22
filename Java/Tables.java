public class Tables 
{

    public static void main(String[] args) 
    {
    
   		int[] tab; //create table
		tab = new int [5]; //reserve space in memory
		tab[0] = 20; //change value in table index

        int[] tab2 = new int [10]; //create and reserve space in one line
        tab2[1] = 7;

		System.out.println(tab[0]); //reference table
		System.out.println(tab2[1]); //reference table2

		int[] tab3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //create instant table with values
        
		System.out.println(tab3.length); //view length table
		System.out.println(tab3.length-1); //reference last index in table

    }


}
