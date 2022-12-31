#!/bin/bash

name="Matthew"; #Bash jest wrazliwe na biale znaki!
echo "Podaj imie: ";
read nameOne;

if [ "$nameOne" = "Matthew" ] #Spacja po if jest potrzebna oraz nawiasy kwadratowe jak i spacja w nawiasach
then  #Jezeli warunek sie zgadza wtedy "then"
   echo "Name is correct";
elif [ "$nameOne" = "Elizabeth" ]; #Opakowanie zmiennej w apostrofy pozwala na wprowadzanie bialch znakow jako ciagu
then
   echo "Name is Elizabeth";
else
   echo "I don't remeber you";
fi #konczymy odwrotnoscia if
echo $nameOne;
echo $name;


