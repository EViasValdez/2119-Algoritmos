#include <iostream>

using namespace std;

bool Comprobador;

int Numero1, Numero2, Numero3, Numero4;

int main ()
{
	Numero1 = 12;
	Numero2 = 24;
	Numero3 = 28;
	Numero4 = 48;
	
	Comprobador = (Numero4 > Numero2 || Numero1 < Numero3);
	cout << Comprobador << endl;
	cin.get();
	
	return 0;
}

