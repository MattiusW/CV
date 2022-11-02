#include <iostream>
#include <string>   // dołączyć bibliotekę string

using namespace std;

int main()
{
    const string nazwa = "To jest stała zmienna"; // nie da się jej nadpisać 
    int a = 40, b = 10, c = 50; 
    short int d;  // kiedy zmienna nie zostanie przypisana zostaje jej nadana losowa wartość

    cout << "a: " << a << " adres: " << &a << "\n"; // polecenie entera
    cout << "b: " << b << " adres: " << &b << "\n";
    cout << "c: " << c << " adres: " << &c << endl; // polecenie kończy line
    cout << "d: " << d << "\n"; 

    char znak = 'c';
    cout << znak << endl;

    string tekst = "Przykładowy tekst";
    cout << tekst << endl;

    string imie = "Mattius";
    string nazwisko = "W";
    string imieInazwisko = imie + " " + nazwisko; // łączenie stringów

    cout << imieInazwisko << endl;
    cout << imie << endl;
    return 0;
}
