#include <stdio.h>
#include <stdlib.h>

int main()
{   
    char imie[20];
    char toImie[] = "Mateusz";
    printf("Podaj swoje imie:\n");
    scanf("%s", imie);  //wprowadzenie danych przez uzytkownika
    printf("Czesc %s\n", imie);
    
    if(stricmp(imie, toImie) == 0)
        printf("Dobrze");
    else
        printf("Źle");

    return 0;
}

