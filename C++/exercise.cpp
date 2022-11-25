#include <iostream>
#define PI 3.14

using namespace std;
void initMenuBox();
void menuDecision(int);
double circleArea(double);
double squareArea(double);
double rectangleArea(double, double);
double triangleArea(double, double);

int main()
{   
    int choice;
    char sign = 'T';

    do
    {
        system("cls");   //cls == clear screen
	    
	initMenuBox();

        cin >> choice;

        menuDecision(choice);
        
	do
	{
	    cout << "Do You want continue? (T/N)" << endl;
	    cin >> sign;	
        
	}while(sign != 't' && sign != 'T' && sign != 'n' && sign != 'N');

    }while(sign == 't' || sign == 'T');

    return 0;
}

void initMenuBox()
{
    cout << "Select options: " << endl;
    cout << "1. Circle area " << endl;
    cout << "2. Square area " << endl;
    cout << "3. Rectangle area " << endl;
    cout << "4. Triangle area " << endl;
}

void menuDecision(int choice)
{   
    double a, h, r;

    switch(choice)
    {
        case 1:
	    cout << "Take radius: " << endl;
	    cin >> r;
	    circleArea(r);
	    break;
        case 2:
	    cout << "Take side square: " << endl;
	    cin >> a;
	    squareArea(a);
	    break;
        case 3:
	    cout << "Take width and height rectangle: " << endl;
	    cin >> a >> h;
	    rectangleArea(a, h);
	    break;
        case 4:
	    cout << "Take base and height triangle: " << endl;
	    cin >> a >> h;
	    triangleArea(a, h);
	    break;
	default:
	    cout << "You should choice option " << endl;
     }
}

double circleArea(double r)
{
    double total = PI * r * r;

    cout << "Radius circle area: " << r << " amount: " << total << endl;
    
    return total;
}

double squareArea(double a)
{
    double total = PI * a * a;

    cout << "Side square area: " << a << " amount: " << total << endl;
    
    return total;
}

double rectangleArea(double a, double h)
{
    double total = a * h;

    cout << "Width rectangle area: " << a << " and height: " << h << " amount: " << total << endl;
    
    return total;
}

double triangleArea(double a, double h)
{
    double total = 0.5 * a * h;

    cout << "Base triangle area: " << a << " and height: " << h << " amount: " << total << endl;
    
    return total;
}
