#include <iostream>

using namespace std;

class Persona
{
	public:
		int SumaDos(int Arg);
		int SumaTres (int Arg);
	
	private:
		int Resultado;
};

int Persona::SumaDos(int Arg);
{
	Resultado = Arg + 2;
	return Resultado;
}

int Persona::SumaTres(int Arg);
{
	Resultado = Arg + 3;
	return Resultado;
}

int main ()
{
	Persona Pers;
	cout << "+ 2 = " << Pers.SumaDos(2) << endl;
	cout << "+ 2 = " << Pers.SumaTres(3) << endl;
	
	cin.get();
	return 0;
}
