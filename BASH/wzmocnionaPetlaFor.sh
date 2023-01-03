#!/bin/bash

#Wzocniona petla for ktora przyjmuje zbior liczb
for i in 1 3 4 5 6 7 8 22 
do  
    echo "Liczba: $i";
done

for j in {0..30}  #mozna podawac zbior
do
    if (( $j % 3 == 0 ))
    then 
       echo $j;
    fi
done

for k in {0..50..5} #zbior z funkcja skoku co iles liczb
do
    echo "Liczby w zbiorze od 0 do 50 co 5: $k"
done

#nie mozna dodawac do zbiorow argumentow wprowadzonych przez uzytkownika nalezy wartosci podac na sztywno
