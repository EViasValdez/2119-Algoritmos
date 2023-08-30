#include <iostream>

using namespace std;

int Numero1 = 14;
int Numero2 = 10;
bool Booleano = true;

int main ()
{
	if (Numero1 < Numero2)
	{
		cout << "Es menor" << endl;
	}
	else if (Numero1 == Numero2)
	{
		cout << "Son lo mismo" << endl;
	}
	else
	{
		cout << "No es menor" << endl;
	}
	
	cin.get();
	return 0;
}