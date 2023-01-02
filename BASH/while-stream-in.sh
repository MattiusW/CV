#!/bin/bash

i=0;
while [[ $i -le 10 ]]
do
   echo $i;
   i=$((i + 1)); #Jesli chcemy zapisac wynik do zmiennej nalezy uzyc znaku $
done

#Wczytanie lini z pliku
while read line
do
   echo $line
done < przekierowanieIdopisanie.txt 
