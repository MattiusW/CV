#include <stdio.h>
#include <stdlib.h>

int temp[3];   //tablica
int tab[5] = {7, 8, 9, 10, 11};
char imie[]= "Mateusz amator jezyka C"; //zapisywanie stringa za pomoca tablic
char *string = "Zapisywanie stringa za pomoca wskaznika";

int i = 0;
int j = 0; 
int k = 5; 
int proba = 58;  

int main()
{  
    printf("%s\n", imie); //rzutowanie stringa '%s' za pomoca printf 
    printf("%c\n", proba); //wyswietlenie znaku z tabeli ASCII
    printf("%s\n", string);
    temp[0] = 10;
    temp[1] = 15;
    temp[2] = 20;
   
    for(i = 0; i < 2; i++)
    {
	printf("%d\n", temp[i]);
    }
    
    while(j < 3)
    {
	printf("%d\n", temp[j]);
        j++;
    }
    
    while(k--)
    {
        printf("%d\n", tab[k]); 
    }

    return 0;
}
