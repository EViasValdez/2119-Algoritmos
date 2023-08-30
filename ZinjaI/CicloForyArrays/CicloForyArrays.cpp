#include <iostream>

using namespace std;

int main ()
{
	char Arreglo [4];
	Arreglo[0] = '1';
	Arreglo[1] = '2';
	Arreglo[2] = '3';
	Arreglo[3] = '4';
	
	for (int i = 0; i < 3; i++)
	{
		cout << Arreglo[i] << endl;
	}
	
	cout << endl;
	cin.get();
	
	return 0;
}