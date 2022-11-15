#include <iostream>

using namespace std;

int main()
{
     int tab[100];

     for (int i = 0; i < 100; i++)
     {    
	 tab[i] = i;
     	 cout << "tab[" << i << "]" << " = " << tab[i] << " adres tablicy: " << &tab[i] << endl;
     }	 
     
     int i = 10;

     while (i) // == while (i != 0)
         cout << "i ma rozmiar: " << i-- << endl;

     do
     {
	 cout << "i wykona sie przynajmniej raz i bedzie sie wykonywac w nieskoczonsc poniewaz nastepuje od razu dekrementacja! " << i-- << endl;
     
     } while (i != 0);

     return 0;
}
