#include <stdio.h> 
#include <stdlib.h>

<<<<<<< HEAD
void zamianaInt(int *zamiana) //deklarowanie wskaznika
=======
void podmiana(int *zamiana) //deklarowanie wskaznika
>>>>>>> 59d3a60f14d62eda60568577061e05fcb4e368cb
{
    *zamiana = 10; //odwolanie sie do wartosci ze wskaznika aby nie dzialac na adresie
}

char tekstDoZamiany[] = "Kurs programowania C"; //0 jest koncem tekstu

void zamianaTekstu(char *tekst)
{
    int i = 0;
    for(i = 0; tekst[i] != 0; i++); //Warunek iterowania po stringu
    printf("%d\n", i);
    char *koniec, temp;
    while(*tekst != ' ' && *tekst != '   ' && *tekst != 0)
    {
        tekst++;
    }
    tekst++;
    printf("%c\n", *tekst);
    koniec = tekst; //Koniec ma wskazywac na poczatek drugiego zdania
    while(*koniec != ' ' && *koniec != '    ' && *koniec != 0)
    {
        koniec++;   //Iterowac do jego konca
    }
    koniec--; //Dekrementowac aby wksazywac od konca
    printf("%c\n", *koniec);
    int przekladanie = ((koniec - tekst) + 1) / 2;
    printf("%d\n", przekladanie);
    for( ; przekladanie > 0 ; przekladanie--)
    {
        temp = *tekst;
        *tekst = *koniec;
        *koniec = temp;
        tekst++;
        koniec--;
    }
}

int main()
{
    int liczba = 5;
<<<<<<< HEAD
    zamianaInt(&liczba); //Wyslanie adresu do funkcji aby nie dzialac na kopii
    printf("%d\n", liczba);
    zamianaTekstu(tekstDoZamiany);
    printf("%s", tekstDoZamiany);
    return 0;
}

=======
    podmiana(&liczba); //Wyslanie adresu do funkcji aby nie dzialac na kopii
    printf("%d\n", liczba);
    return 0;
}
>>>>>>> 59d3a60f14d62eda60568577061e05fcb4e368cb
