#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char name[20];
char secondName[20];
char guess[3][20] = {"Cat", "Dog", "Fish"};

void ifStringIsEquel(char *str1, char *str2)
{
    if(stricmp(str1, str2) == 0)
        printf("Strings equal\n");
    else
        printf("Strings unequal\n");
}

int main()
{   
    printf("Input first pet\n");
    scanf("%s", &name);  
    ifStringIsEquel(name, guess[1]); //Function comper strings in index == "dog" index[1]
    printf("Input first name\n");
    scanf("%s", &name);
    printf("Input second name to compare\n");
    scanf("%s", &secondName);
    ifStringIsEquel(name, secondName);
    return 0;
}




