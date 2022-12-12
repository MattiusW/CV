#include <stdio.h>
#include <stdlib.h>

int main()
{
    struct Struktura
    {
        short liczbaShort;
        int liczbaInt;
    }mojaStruktura;

    mojaStruktura.liczbaShort = 12345;
    mojaStruktura.liczbaInt = 1234567;

    printf("Rozmiar Struktury: %d\n", sizeof(mojaStruktura));
    printf("Short: %d\n", mojaStruktura.liczbaShort);
    printf("Int: %d\n", mojaStruktura.liczbaInt);

    union Unia //union deklaruje rozmiar w pamieci tylko dla najwiekszego typu dancyh
    {
        short liczbaShort;
        int liczbaInt;
    }mojaUnia;

    mojaUnia.liczbaShort = 12345;
    mojaUnia.liczbaInt = 1234567;

    printf("Rozmiar Struktury: %d\n", sizeof(mojaUnia));
    printf("Short: %d\n", mojaUnia.liczbaShort);
    printf("Int: %d\n", mojaUnia.liczbaInt);

    return 0;
}