#include <stdio.h>
#include <stdlib.h>

long silnia(int x)
{   
    
    long wynik = 1;
    for (int i = 1; i <= x; i++)
    {
       wynik *= x;
       printf("Wynik = %ld\n", wynik);
       x--;
       printf("x = %d\n", x);
       i--; 
    } 
    return wynik;
}

long silniaDwa(int x)
{
   long wynik = 1;
   while (x > 1)
   {
      wynik = x * wynik;
      x--;
   }
   return wynik;
}

long silniaRekurencja(int x)
{
   if(x == 1)   //domyslny przypadek
      return 1;
   else
      return x * silniaRekurencja(x - 1);  //odwolanie sie do samej siebie
}
int main()
{
    const int liczba = 5; //zmienna tylko do odczytu
    printf("Silnia: %ld\n", silnia(liczba)); 
    printf("Silnia dwa: %ld\n", silniaDwa(liczba)); 
    printf("Silnia rekurencyjna: %ld\n", silniaRekurencja(liczba)); 

    return 0;
}
