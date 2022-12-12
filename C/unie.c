#include <stdio.h>
#include <stdlib.>

int main()
{
    struct Struktura
    {
        short liczbaShort;
        int liczbaInt;
    }mojaStruktura;

    mojaStruktura.liczbaShort = 12345;
    mojaStruktura.liczbaInt = 1234567;

    printf("Rozmiar Struktury: %d\n", sizeof(MojaStruktura));
    printf("Short: %d\n", mojaStruktura.liczbaShort);
    printf("Int: %d\n", mojaStruktura.liczbaInt);

    return 0;
}