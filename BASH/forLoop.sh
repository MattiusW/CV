#!/bin/bash

#Tworzenie zmiennej odbywa sie bez znaku $ ale odwolanie sie do zmiennej nastepuje za pomoca znaku $
for ((i=0; i<=10 ;i=$i+1))
do
    echo "Liczba: $i";
done

echo "Podaj liczbe startowa (wlaczajac): ";
read start;

echo "podaj liczbe koncowa (wlaczajac): ";
read stop;

for ((j=$start; j<=$stop ;j=$j+1))
do
    echo "Liczba: $j";
done
