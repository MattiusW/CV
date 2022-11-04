#include <iostream>

using namespace std;

int main()
{
    int a = 10;
    int b = 2;
    int c = 7;
    int d = 4;
    
    cout << a + b << endl; // dodawanie
    cout << a * b << endl; // odejmowanie 
    cout << a / b << endl; // dzielenie
    cout << c % d << endl; // dzielenie modulo reszta z dzielenia
    cout << (a == b) << endl; // 0 w przyadku FALSE
    cout << (a != b) << endl; // 1 w przypadku TRUE
    cout << !(a == b) << endl; // Negacja tego co jest w nawiasie
    cout << (a > b) << endl;
    cout << (a < b) << endl;
    cout << (a >= b) << endl; // Wypisze True 1 lub False 0

    return 0;
}