#include <iostream>

int Numero1 = 14;
int Numero2 = 14;

int Suma;

using namespace std;

void Funcion()
{
	cout << "Funcion sin valor de retorno" << endl;
}

int Sumar(int a, int b)
{
	return (a) + (b);
}

int main ()
{
	Suma = Sumar (Numero1, Numero2);
	cout << Suma << endl;
	Funcion();
	
	cin.get();
	return 0;
}
