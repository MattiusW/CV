#include <stdio.h>
#include <stdlib.h>

struct Konsument     //Struktura (tak jakby klasa w programowaniu obiektowym) 
{
   char *imie;
   int wiek;
   float dochod; 
   char *rozrywka;      
}marian, kamil;

int main()
{
    struct Konsument rafi;
    rafi.imie = "Rafal";
    rafi.wiek = 32;     
    rafi.dochod = 4000.00;
    rafi.rozrywka = "Netflix";

    marian.imie = "Marian";
    marian.wiek = 33;
    marian.dochod = 0.00;
    marian.rozrywka = "alkohol";

    kamil.imie = "Kamil";
    kamil.wiek = 30;
    kamil.dochod = 9000.00;
    kamil.rozrywka = "gadanie"; 
   
    printf("Imie: %s, wiek: %d, dochod: %.2f euro, ulubiona rozrywka: %s\n", rafi.imie, rafi.wiek, rafi.dochod, rafi.rozrywka);
    printf("Imie: %s, wiek: %d, dochod: %.2f zl, ulubiona rozrywka: %s\n", marian.imie, marian.wiek, marian.dochod, marian.rozrywka);
    printf("Imie: %s, wiek: %d, dochod: %.2f zl, ulubiona rozrywka: %s\n", kamil.imie, kamil.wiek, kamil.dochod, kamil.rozrywka);

    return 0;
}


