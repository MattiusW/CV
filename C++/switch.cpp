#include <iostream>

using namespace std;

int main()
{
    int a = 50;
    char b = 'k';

    switch(a) // switch is only use to int and char variable
    {
        case 0:
	     cout << "a is equal 0" << endl;
	case 25:
	     cout << "a is equal 25" << endl;
	case 50:
	     cout << "a is equal 50" << endl;
	     break;
	default:
	     cout << "a is not equal 0, 25, 50" << endl;
    }
    
    switch(b)
    {
        case 'c':
	     cout << "it is not c" << endl;
        case 'd':
	     cout << "it is not d" << endl;
        case 'e':
	     cout << "it is not e" << endl;
        case 'k':
	     cout << "it is k" << endl;
	     break;
        case 'f':
	     cout << "it is not f" << endl;
	default:
	     cout << "is not c, d, e, f" << endl;
    }

    return 0;

}
