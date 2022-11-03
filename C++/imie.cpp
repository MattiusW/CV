#include <iostream>
#include <string>  //biblioteka string

using namespace std;

int main ()
{   
    string imie;
    string nazwisko; //zmienne

    cout << "Podaj Swoje imie: " << endl; //wyjscie strumienia
    cin >> imie; //wejscie strumienia do zmiennej

    cout << "Podaj Swoje nazwisko: " << endl;
    cin >> nazwisko;

    cout << "Miło mi Cię poznać " << imie << " " << nazwisko << endl; //wyjscie zapisanych zmiennych
    
    return 0;
}
