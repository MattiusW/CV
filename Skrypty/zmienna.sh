#!/bin/bash
echo "Podaj nazwe katalogu" $SHELL #Wypisanie wiadomości na ekran
read ZMIENNA #Odczytanie zmiennej przez użytkownika	 

if [ -e $ZMIENNA ] #Sprawdzanie czy plik istnieje
then
	echo "Istnieje plik lub katalog o podanej nazwie" #Jeżeli istnieje wyświetlamy na ekran

	if [ -d $ZMIENNA ] #Sprawdzamy czy istnieje i jest katalogiem
		then
			echo "Zbiór istnieje i jest katalogiem"
			ls -l $ZMIENNA >> plik.txt #Wyświetlenie katalogu i przekierowanie strumienia do pliku
		else
			echo "Zbiór istnieje i jest plikem zwykłym" #Wyświetlanie sprawdzenia na ekran
			cat $ZMIENNA >> plik.txt	#Wyświetlenie pliku i przekierowanie strumienia do pliku
	fi #Zakończenie funkcji

else 
	echo "Nie istnieje" #Wyświetlenie jeżeli plik nie istnieje

fi #Zakończenie programu
