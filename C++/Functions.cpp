#include <iostream>

using namespace std;

void welcome();   //Declare procedure. Nothing return.
double addFunction(double a, double b); //Declare fuction.
double subtract_inline(double c, double d) {return c - d;} //Inline function.

int main()
{   
    welcome();    //Call function
    cout << addFunction(2,2) << endl;
    cout << subtract_inline(10,7) << endl; //Call inline function.

    return 0;
}

void welcome()  
{
    cout << "Welcome buddy! " << endl;
}

double addFunction(double a, double b)
{
    return a + b;
}

