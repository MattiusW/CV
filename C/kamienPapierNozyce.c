#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main()
{   
    int wybor = 0;
    printf("Cześć zagraj ze mną w kamień papier nożyce.\n");
    printf("0 oznacza kamień, 1 papier, 2 nożyce.\n");
    srand(time(NULL));
    int enemy = rand() % 3;
    //printf("Enemy random: %d\n", enemy);
    scanf("%d", &wybor);  //nie pisac nic w funkcji scanf

    

    if(wybor == 0 || wybor == 1 || wybor == 2)
    {
        printf("Gramy!\n");
        if(wybor == enemy)
            printf("Remis mamy to samo");
        else if(wybor == 0 && enemy == 1)
            printf("Przegrałeś masz kamień a ja wybrałem: %d - papier!", enemy);
        else if(wybor == 0 && enemy == 2)
            printf("Wygrałeś masz kamień a ja wybrałem: %d - nożyce!", enemy);
        else if(wybor == 1 && enemy == 0)
            printf("Wygrałeś masz papier a ja wybrałem: %d - kamień!", enemy);
        else if(wybor == 1 && enemy == 2)
            printf("Przegrałeś masz papier a ja wybrałem: %d - nożyce!", enemy);
        else if(wybor == 2 && enemy == 0)
            printf("Przegrałeś masz nożyce a ja wybrałem: %d - kamień!", enemy);
        else if(wybor == 2 && enemy == 1)
            printf("Wygrałeś masz nożyce a ja wybrałem: %d - papier!", enemy);

    }
    else
    {
        printf("Zły wybor! Wybrałeś: %d Przegrałeś haha!\n", wybor);
    }
    
    
    return 0;
}