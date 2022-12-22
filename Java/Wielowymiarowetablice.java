public class Wielowymiarowetablice
{

    public static void main(String[] arg)
    {

    /* Tablica wielowymiarowa (indexy)
      ----------------------------
      | [0][0] | [0][1] | [0][2] |
      ----------------------------
      | [1][0] | [1][1] | [1][2] |
      ----------------------------
      | [2][0] | [2][1] | [2][2] |
      ----------------------------
      | [3][0] | [3][1] | [3][2] |
      ----------------------------
    */
    
    int[][] tab = new int[4][3]; //Tworzenie tablicy wielowymiarowej i rezerwowanie miejsca w pamięci

    tab[0][0] = 25;
    tab[3][2] = 70; //Nadpisanie wartości w indexie tablicy wielowymiarowej

    int[][] tab2 =
    {
        {0, 1, 2},
	      {3, 4, 5},  //Tworzenie gotowej tabilcy wielowymiarowej
	      {6, 7, 8}
    }; 

    System.out.println(tab[3][2]);
    System.out.println(tab2[2][1]); //Odowałanie się do indexu tablicy

    }
}
