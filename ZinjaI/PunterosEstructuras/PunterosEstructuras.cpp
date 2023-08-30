#include <iostream>
using namespace std;

struct Estructura
{
	int Dato;
} Estrct, *Puntero;

int main ()
{
	Estrct.Dato = 12;
	Puntero = &Estrct;
	
	cout << Puntero << endl;
	cout << &Estrct.Dato << endl;
	cout << Puntero->Dato << endl;
	
	cin.get();
	return 0;
}