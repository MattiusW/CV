#include <stdio.h>
#include <stdlib.h>

int liczba = 4;

int main()
{
    if(liczba % 2 == 0) //jezeli dzielenie nie zostawia reszty
    {
        printf("Liczba jest parzysta\n");
    }
    else
    {
        printf("Liczba jest nieparzysta\n");
    }

    return 0;
}
