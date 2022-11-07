#include <iostream>

using namespace std;

int main()
{   
    int a;
    int b;
    cout << "Podaj liczbe a" << endl;
    cin >> a;
    cout << "Podaj liczbę b" << endl;
    cin >> b;

    if (a < b)
         cout << a << " jest mniejsze od " << b << endl;
    else if (a == b)
    {
         cout << a << " jest równe " << b << endl;
	 cout << "a to jest blok ";
	 cout << "instrukcji warunkowej" << endl;
    }
    else
	 cout << a << " jest większe od " << b << endl;
}
