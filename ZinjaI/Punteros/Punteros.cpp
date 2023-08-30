#include <iostream>

using namespace std;

int Numero = 24;
int *Puntero = &Numero;

int main ()
{
	cout << *Puntero << endl;
	
	cin.get();
	return 0;
}