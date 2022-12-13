#include <stdio.h>
#include <stdlib.h>

int main()
{
    int mnozenie = 1;
    for(int i = 1; i <= 10; i++)
    {    
        for(int j = 1; j <= 10; j++)
            printf("%d ", i * j);  
    }
    
    return 0;
}