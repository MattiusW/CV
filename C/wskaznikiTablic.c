#include <stdio.h>
#include <stdlib.h>

int tab[] = {1, 5, 9};

void modyfikuj(int *tab)    //moze byc tez zapis tab[]
{
    *tab = 11;
    tab[1] = 10; //odwolanie sie do kolejnego elementu tablicy
    printf("%d %d %d\n", *tab, tab[1], *(tab+2)); //odwolanie sie do 3 elementu z tablicy

}

int main()
{
    modyfikuj(tab);  //tablica sama w sobie jest wskaznikiem adresu
    printf("%d %d\n", tab[0], tab[1]);  //moze byc tez zapis *tab
    return 0;
}
