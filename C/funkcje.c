#include <stdio.h>
#include <stdlib.h>

void hello()   //funkcja wywolywana w main musi znajdowac sie nad nia
{
    printf("Hello world!\n");    
}

int dzialanieArytmetyczne(int x, int y, int z)
{
    return x + y - z;   
}

void czyParzysta(int liczba)
{
    if(liczba % 2 == 0)
       printf("Podana liczba jest parzysta\n");
    
    else 
       printf("Podana liczba nie jest parzysta\n");  
}

int main()
{
    hello();
    printf("%d\n", dzialanieArytmetyczne(10, 1, 6));
    int wynik = dzialanieArytmetyczne(8, 2, 3);  //przechowanie zwroconej wartosci w zmiennej
    printf("%d\n", wynik);
    czyParzysta(7);
    return 0;
}
