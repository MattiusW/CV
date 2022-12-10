#include <stdio.h> 
#include <stdlib.h>

void podmiana(int *zamiana) //deklarowanie wskaznika
{
    *zamiana = 10; //odwolanie sie do wartosci ze wskaznika aby nie dzialac na adresie
}

int main()
{
    int liczba = 5;
    podmiana(&liczba); //Wyslanie adresu do funkcji aby nie dzialac na kopii
    printf("%d\n", liczba);
    return 0;
}
