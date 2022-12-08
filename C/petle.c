#include <stdio.h>
#include <stdlib.h>

int i = 0;
int j = 50;
int k = 20;

int main()
{
    while(i < 10)
    {   
        ++i;   //pre inkrementacja od 1 do 10
        printf("%d\n",i); 
        //i++;  //post inkrementacja od 0 do 10
    }
    
    do
    {
        ++i;
        printf("%d\n",i);  
        i++;                 
        printf("%d\n",i);  
        ++i;
        printf("%d\n",i);   
        i++;
        printf("%d\n",i); 
    }while(i < 10); //przed sprawdzeniem warunku do i = 10 nastapi poczworna inkrementacja
    
    while(i--)
    {
        printf("%d\n",i); 
    }
    
    while(j++) //petla nie skonczona  
    {
        printf("%d\n",j);
        if(j >= 100)
        {
            break; // instrukcja skoku, zabezpieczenie przed nieskonczona petla
        }
    }    

    while(k--)
    {
        if(k % 2 != 0)
        {
            continue;  //instrukcja skoku pomijajaca liczby nieparzyste
        }
        printf("%d\n",k);
    }

    for(i = 0; i < 10 ; i++) 
    {
        printf("%d\n",i); 
    }    
    
    return 0;
} 
