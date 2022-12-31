#!/bin/bash

liczba1=2;
liczba2=3;
liczba3=4;
liczba4=5;

#Nalezy uzywac nawiasow aby ustalic priorytety wyrazen logicznych
if [[ ($liczba1 -ge 2 || $liczba2 -ge 3) && ($liczba3 -ge 4 || $liczba4 -ge 5) ]]
then
    echo "Mozna wejsc";
else
    echo "Nie udalo sie wejsc";
fi

