#include <iostream>
//Smallest Multiple of the numbers from 1 to 20

//Finds the smallest multiple of x that is divisble by y
int smallestMultiple( int x, int y ) {
	int multiple = x;
	while ( multiple % y != 0 ) {
		multiple += x;
	}
	return multiple;
}

int main(){
	const int numbersTo = 20;
	int multiple = 1;
	for ( int i = 1; i < numbersTo; i++ ){
		multiple = smallestMultiple( i, multiple );
	}
	std::cout << multiple << std::endl;
}