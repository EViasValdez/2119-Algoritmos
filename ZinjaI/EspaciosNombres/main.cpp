#include <iostream>

namespace Fraccionamiento
{
	int Privada;
}

using namespace Fraccionamiento;

int main ()
{
	Privada = 12;
	std::cout << Fraccionamiento::Privada << endl;
	
	std::cin.get();
	return 0;
}
