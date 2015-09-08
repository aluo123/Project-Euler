#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

long primesLessThanK( int k ) {
	int n = 2;
	long sum = 0;
	vector<int> primes;
	primes.push_back(2);
	while ( n < k ) {
		bool isPrime = true;
		for ( vector<int>::iterator it = primes.begin(); *it <= sqrt(n); it++ ) {
			if ( n % *it == 0 ) {
				isPrime = false;
				break;
			}
		}
		if ( isPrime ) {
			primes.push_back(n);
			sum += n;
		}
		n++;
	}
	return sum;
}

int main(){
	cout << primesLessThanK(2000000) << endl;
}