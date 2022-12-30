#!/bin/bash

name="Matthew"; #Bash jest wrazliwe na biale znaki!

if [ $name = "Matthew" ] #Spacja po if jest potrzebna oraz nawiasy kwadratowe jak i spacja w nawiasach
then  #Jezeli warunek sie zgadza wtedy "then"
   echo "Name is correct";
elif [ $name = "Elizabeth" ];
then
   echo "Name is Elizabeth";
else
   echo "I don't remeber you";
fi #konczymy odwrotnoscia if
echo $name;


