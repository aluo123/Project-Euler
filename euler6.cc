#include <iostream>
//Find the difference of the square of the sum of the first 100 natural numbers 
//and the sum of the squares of the first 100 natural numbers

int sumSquares( int x ) {
	int sum = 0;
	for ( int i = 1; i <= x; i++ ) {
		sum += i*i;
	}
	return sum;
}

int squareSum( int x ) {
	int sum = 0;
	for ( int i = 1; i <= x; i++ ) {
		sum += i;
	}
	return sum*sum;
}

int main(){
	int num = 100;
	std::cout << squareSum(num) - sumSquares(num) << std::endl;
}