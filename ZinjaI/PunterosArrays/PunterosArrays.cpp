#include <iostream>

using namespace std;

int Arreglo[4];
int *P;

int main ()
{
	P = Arreglo;
	cout << "Direccion Arreglo[0]" << &Arreglo << endl;
	P++;
	cout << "Puntero " << P << endl;

	cin.get();
	return 0;
}
