#include <iostream>

const int fibMax = 4000000;

int main(){
	int fib1 = 0;
	int fib2 = 1;
	int sum = 0;
	while ( fib2 < fibMax ) {
		if ( fib2 % 2 == 0 ) {
			sum += fib2;
		}
		int nextFib = fib1 + fib2;
		fib1 = fib2;
		fib2 = nextFib;
	}
	std::cout << sum << std::endl;
}