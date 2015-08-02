#include <iostream>
//Find the largest prime factor of 600851475143

long largestPrimeFactor( long num ) {
	int factor = 2;
	//If it finds a factor, divides the number by that factor. When the factor reaches the number,
	//the number will be a prime because we've removed all other factors ( including any smaller prime factors )
	while ( factor < num ) {
		if ( num % factor == 0 ) {
			num /= factor;
			factor = 2;
		}
		else {
			factor++;
		}
	}
	return factor;
}

int main(){
	std::cout << largestPrimeFactor(600851475143) << std::endl;
}