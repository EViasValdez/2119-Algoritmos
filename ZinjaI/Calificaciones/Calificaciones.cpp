#include <iostream>
#include <conio.h>

using namespace std;

int main (int argc, char *argv[]) {
	int Calificacion;
	
	cout << "Ingresa tu calificacion: ";
	cin >> Calificacion;
	
	if (Calificacion >= 8 && Calificacion <= 10)
	{
		cout << "Alumno aprobado";
	}               
	else
	{
		if (Calificacion >= 1 && Calificacion < 8)   
		{
			cout << "Alumno reprobado";
		}    
		else
		{
			if (Calificacion <= 0 || Calificacion > 10)
			{
				cout << "Calificacion no valida";
			}
			else {
				if (Calificacion <= 0 || Calificacion > 10)
				{
					cout << "Calificacion no valida";
				} 
			}
		}
	}
	getche();
	return 0;
}
