#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numer = 10;
    int liczba = 0;

    int i = 0;
    while(i < 7)
    {
        scanf("%d", &liczba);
        printf("Liczba: %d\n", liczba);
        i++;
        printf("Warunek: %d\n", i);
        if(liczba == numer)
        {
            printf("Brawo\n");
            break;
        }
        else
        {
            printf("Spróbuj ponownie\n");
            continue;
        }
    }
    return 0; 
}