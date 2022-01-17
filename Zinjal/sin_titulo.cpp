#include <iostream>
#include<conio.h>
using namespace std;

int main(int argc, char *argv[]) {
	int calificacion;
	cout<<"Ingresa tu calificacion:";
	cin>>calificacion;
	if(calificacion >=8 && calificacion<=10)
	{
		cout<<"Alumno aprobado";
	}               
	else
	{
		if(calificacion >=1 && calificacion <8)   
		{
			cout<<"Alumno reprobado";                 
		}    
		else
		{
			if(calificacion <=0 || calificacion >10)
			{
				cout<<"Calificaicon no valida";         
				
	
			}
			else{
		if(calificacion <=0 || calificacion >10)
		{
			cout<<"Calificaicon no valida";                 
		} 
	}
		}
	}


		
	
	getche();
	return 0;
}
