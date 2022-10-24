#!/bin/bash
echo "Podaj nazwe katalogu lub pliku" $SHELL #Wypisanie wiadomości na ekran, odwołanie się do powłoki
read ZMIENNA #Odczytanie zmiennej przez użytkownika	 

if [ -e $ZMIENNA ] #Sprawdzanie czy plik istnieje
then
	echo "Istnieje plik lub katalog o podanej nazwie" #Jeżeli istnieje wyświetlamy na ekran

	if [ -d $ZMIENNA ] #Sprawdzanie czy istnieje i jest katalogiem
		then
			echo "Zbiór istnieje i jest katalogiem"
			ls -l $ZMIENNA >> plik.txt #Wyświetlenie katalogu i przekierowanie strumienia do pliku
		else
			echo "Zbiór istnieje i jest plikem zwykłym" #Wyświetlanie sprawdzenia na ekran
			cat $ZMIENNA >> plik.txt	#Wyświetlenie pliku i przekierowanie strumienia do pliku
	    
		if [ -r $ZMIENNA ] #Sprawdzanie czy plik jest do odczytu
			then
				echo "Jest do odczytu"
			else
				echo "Brak możliwości odczytu"
	    	
	    	fi
	fi #Zakończenie funkcji
         
else 
	echo "Nie istnieje" #Wyświetlenie jeżeli plik nie istnieje

fi #Zakończenie programu
