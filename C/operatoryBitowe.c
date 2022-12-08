#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Wynik: %d\n", 1 << 4); // przesuniecie 1 o 4 miejsc 
    printf("Wynik: %d\n", 1 >> 1); // przesuniecie 1 o 1 miejsce 
    printf("Wynik: %d\n", 4 & 1);
    printf("Wynik: %d\n", 4 | 2);
    printf("Wynik: %d\n", 4 ^ 2);
    return 0;
}

// ~ - negacja bitowa
// << - operator przesuniecia w lewo
// >> - operator przesuniecia w prawo
// & - koniunkcja bitowa jest prawdziwa jesli oba przypadki sa prawdziwe
// | - alternatywa bitowa 
// ^ - operator roznicy

