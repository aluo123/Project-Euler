#include <iostream>
//Adding multiples of 3 and 5 that are less than 1000

int main() {
	int sum = 0;
	for ( int i = 1; i < 1000; i++ ) {
		if ( i % 3 == 0 ) {
			sum += i;
		}
		else if ( i % 5 == 0 ) {
			sum += i;
		}
	}
	std::cout << sum << std::endl;
}