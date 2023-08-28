#include <iostream>

using namespace std;

int main ()
{
	struct Personaje
	{
		int Edad;
		int Telefono;
	} Eduardo;
	
	Eduardo.Edad = 23;
	Eduardo.Telefono = 3123;
	cout << Eduardo.Edad << endl;
	cout << Eduardo.Telefono << endl;
	
	cin.get();
	return 0;
}

