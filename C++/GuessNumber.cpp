#include <iostream>
#include <string>
#include <random>    //import kit

using namespace std;

int main()
{
    string name; //declare varible
    int guessNumber;
    random_device rd; //get random number from hardware
    mt19937 gen(rd()); //seed the generator
    uniform_int_distribution<> distr(1, 11); //set the range
    int randomNumber = distr(gen); //declare generator to varible
    cout << randomNumber << endl; 

    cout << "Hello? What's you'r name?" << endl;
    cin >> name;
    cout << "Hi " << name << " Guess what about number I'm thinking?" << endl;
    cout << "You have a five chance. Good luck " << name << endl; 

    for (int i = 0; i < 5; i++)
    {
        cout << "Enter number: " << endl;
	
	while (true) //try to enter int value
	{
	   cin >> guessNumber;
           if (!cin)
	   {    
              cout << "Wrong value! Try again" << endl;
	      cin.clear();
	      cin.ignore(numeric_limits<streamsize>::max(), '\n');
	      continue; 
	   }
	   else break;
	}

	if (guessNumber > randomNumber)
	{
	    cout << "You're number is too big" << endl;
	}

	else if (guessNumber < randomNumber)
        {
	    cout << "You're number is too small" << endl;
	}
       
	else if (guessNumber == randomNumber)
	{
	    cout << "Correct this is that number == " << randomNumber << endl;
	    break;
	}
	
    }
    return 0;
}
