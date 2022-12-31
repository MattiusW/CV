#!/bin/bash

echo "Podaj zwierze a ja Ci powiem czy je znam: ";
read zwierze;
#Podwojne klamrowe nawiasy pozwalaja wykonac || i &&
if [[ "$zwierze" = "pies" || "$zwierze" = "kot" ]]
then
    echo "Zgadza sie znam to zwierze to $zwierze";
else
    echo "Nie znam tego zwierzecia: $zwierze";
fi
