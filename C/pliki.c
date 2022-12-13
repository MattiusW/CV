#include <stdio.h>
#include <stdlib.h>

int main()
{
    
    char tekst[] = "Hello World!\n";

    FILE *plik;
    //Obsluga bledu
    if ((plik = fopen("tekst.txt", "w")) == NULL) //Warunek niepowodzenia otwarcia 
    {
        printf("Cos poszlo nie tak\n");
        exit(1);  //przerwanie programu z kodem bledu o numerze 1      
    }
    fprintf(plik, "%s", tekst);
    fclose(plik); //Nalezy zamknac plik podajac dekryptor w celu oszczedzania pamieci
    
    FILE *file;
    if ((file = fopen("proba.txt", "r")) == NULL) 
    {
        printf("Something wrong\n");
        exit(1);
    }
    
    int liczba;
    fscanf(file, "%d", &liczba);   //funkcja wczytywania wejscia pliku 
    printf("%d\n", liczba);
    fclose(plik);

    return 0;
}
