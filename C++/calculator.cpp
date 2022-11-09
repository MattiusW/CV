#include <iostream>
#include <string>

using namespace std;

int main()
{
    cout << "--------------------" << endl;
    cout << "| Simple calculator|" << endl;
    cout << "|by Mateusz Walczyk|" << endl;
    cout << "--------------------" << endl; //Statement for user

    double v1, v2;
    
    //Give first and second number
    cout << "Enter first number:" << endl;
    cin >> v1;
    cout << "Enter second number:" << endl;
    cin >> v2;                
    //Ask what next and view option
    cout << "What are you do now with this varibles?" << endl;
    cout << "Enter + to add" << endl;
    cout << "Enter - to subtract" << endl;
    cout << "Enter * to multiple" << endl;
    cout << "Enter / to division" << endl;
    
    char sign;

    cin >> sign;

    switch(sign)
    {
        case '+':
             cout << v1 << " + " << v2 << " = " << (v1 + v2) << endl;
	     break;
	case '-':
	     cout << v1 << " - " << v2 << " = " << (v1 - v2) << endl;
	     break;
	case '*':
	     cout << v1 << " * " << v2 << " = " << (v1 * v2) << endl;
	     break;
	case '/':
	     if (v2 != 0)
	         cout << v1 << " / " << v2 << " = " << (v1 / v2) << endl;
	     else
		 cout << "Don't divison by zero" << endl;
	         break;
    }

    return 0;

}
