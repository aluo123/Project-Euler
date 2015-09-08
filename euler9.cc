#include <iostream>
#include <cmath>

int main(){
	int a = 1;
	int b = 1;
	while ( a < 1000 ) {
		b = 1;
		while ( a + b < 1000 ) {
			int c = 1000 - a - b;
			if ( a*a + b*b == c*c ) {
				std::cout << a << " " << b << " " << c << " " << std::endl;
				std::cout << a*b*c << std::endl;
				return 0;
			}
			b++;
		}
		a++;
	}
}