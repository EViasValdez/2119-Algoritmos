#include <iostream>

using namespace std;

int main ()
{
	struct Universidad
	{
		int Clave;
		int Tipo;
	} UPTecamac, UPTexcoco;
	
	UPTecamac.Clave = 56754;
	UPTecamac.Tipo = 3155;
	UPTexcoco.Clave = 354567;
	UPTexcoco.Tipo = 73546;
	
	UPTecamac = UPTexcoco;
	cout << UPTecamac.Clave << endl;
	
	cin.get();
	return 0;
}
