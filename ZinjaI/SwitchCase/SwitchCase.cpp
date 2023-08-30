#include <iostream>

using namespace std;

int main ()
{
	char a;
	
	cout << "Escribe una opcion" << endl;
	cin >> a;
	
	switch(a)
	{
		case 'a':
			cout << "Esta es la opcion A \n" << endl;
		break;
		case 'b':
			cout << "Esta es la opcion B \n" << endl;
		break;
		case 'c':
		cout << "Esta es la opcion C \n" << endl;
			break;
		case 'd':
			cout << "Esta es la opcion D \n" << endl;
		break;
		default:
			cout << "No se eligio ninguna opcion valida \n" << endl;
	}
	
	system("pause");
	return 0;
}