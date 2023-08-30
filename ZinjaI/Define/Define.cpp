#define sumar(a,b) a + b
#define multiplicar (a,b) a * b
#define dividir (a,b) a / b

#include <iostream>

int Numero1 = 10;
int Numero2 = 10;

int SM;
int MT;
int DV;

using namespace std;

int main()
{
	SM = sumar (Numero1, Numero2);
	MT = multiplicar (Numero1, Numero2);
	DV = dividir (Numero1, Numero2);
	
	cout << "El total de la suma es: " << SM << endl;
	cout << "El total de la resta es: " << MT << endl;
	cout << "El total de la multiplicacion es: " << DV << endl;
	
	cin.get();
	return 0;
}
