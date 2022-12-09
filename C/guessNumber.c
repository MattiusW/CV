#include <stdio.h>
#include <stdlib.h>
#include <time.h>    //Include libary time


int main()
{
    int i = 0;
    char name[20];
    printf("Hi human! Tell me what's your name: ");
    scanf("%s", name);
    printf("Welcome %s\n", name);
    printf("Let's play a game. You must guess number. I've been thinking number about between 0, 10\n");
    printf("What's that number? You have five chance:\n");
    srand(time(NULL));   //Get function time to draw diffrent number
    int guess = rand() % 11;
    printf("%d\n",guess);
    
    int number = 0;
    int chance = 5;

    for(i = 0; i < 5; i++)
    {
        printf("You have %d chance\n", chance);
        chance--;
        scanf("%d", &number);
        
        if(number == guess)
        {
            printf("You won!");
            break;
        }

        else if(number > guess)
        {
            printf("Your number is too big mat\n");
            continue;
        }

        else if(number < guess)
        {
            printf("Your number is too small mate\n");
            continue;
        }
    }
    
    return 0;
}