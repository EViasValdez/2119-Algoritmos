#include <iostream>
#include <conio.h>

using namespace std;
bool Comprobador;

int Numero1 = 28;
int Numero2 = 20;

int main () {
	Comprobador = (Numero1 == Numero2);
	cout << Comprobador << endl;
	
	getch();
	return 0;
}

