#include <iostream>
#include <vector>
using namespace std;

int kthPrime( int kth ) {
	int n = 2;
	vector<int> primes;
	while ( primes.size() != kth ) {
		bool isPrime = true;
		for ( vector<int>::iterator it = primes.begin(); it != primes.end(); it++ ) {
			if ( n % *it == 0 ) {
				isPrime = false;
				break;
			}
		}
		if ( isPrime ) {
			primes.push_back(n);
		}
		n++;
	}
	return primes.back();
}

int main(){
	cout << kthPrime(10001) << endl;
}