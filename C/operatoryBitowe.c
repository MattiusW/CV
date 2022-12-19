#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Wynik: %d\n", 45 << 7); // przesuniecie liczby binarnej o dana liczbe miejsc 
    printf("Wynik: %d\n", 36 >> 2); // przesuniecie liczby binarnej o dana liczbe miejsce 
    printf("Wynik: %d\n", 72 & 54);
    printf("Wynik: %d\n", 84 | 25);
    printf("Wynik: %d\n", 27 ^ 17);
    printf("%d\n", 20 % 7);
    return 0;
}

// ~ - negacja bitowa
// << - operator przesuniecia w lewo
// >> - operator przesuniecia w prawo
// & - koniunkcja bitowa jest prawdziwa jesli oba przypadki sa prawdziwe
// | - alternatywa bitowa 
// ^ - operator roznicy

