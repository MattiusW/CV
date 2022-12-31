#!/bin/bash

echo "Podaj imie: ";
read imie;

echo "Podaj haslo: ";
read haslo;

if [[ "$imie" = "Mati" && "$haslo" = "abc" 
       || "$imie" = "Nowy" && "$haslo" = "haslo" ]]
then
    echo "Udzielam dostepu";
    exit 0; #Kod bledu 0 wszystko poszlo poprawnie
else
    echo "Bledne imie lub haslo";
    exit 1; #Kod bledu 1 wystapil blad
fi
#echo $? - instrukcja ktora wyswietla kod bledu po dzialaniu programu

