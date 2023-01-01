#!/bin/bash

for ((i=$1; i<=$2 ;i=$i+1)) #Argumenty wejsciowe od razu przy odpalaniu programu
do  
    if (( $i % $3 == 0 ))    #Operacje matematyczne w BASHU zapisuje sie w nawiasach okraglych
    then
        echo "Liczba: $i";
    fi
done
