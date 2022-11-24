#include <iostream>

using namespace std;

int power(int, int);
void power(double, int);  //Polimorfizm, przeciążenie funkcji. Ta sama nazwa inne parametry.

int main()
{
    double x;
    int w;

    cout << "Podaj podstawe potęgi: " << endl;
    cin >> x;
    cout << "Podaj podstawę wykładnika: " << endl;
    cin >> w;
    
    power(x, w);

    return 0;
}

int power(int x, int w)
{
    int x0 = x;
    
    while (w-- > 1)
        x = x * x0;
   
    return x;
}

void power(double x, int w)
{
    double x0 = x;
    
    int i = 0;

    while (i++ < w)
    {
	cout << x0 << " ^ " << i << " = " << x << endl;
        x *= x0;
    }

    return;
}
