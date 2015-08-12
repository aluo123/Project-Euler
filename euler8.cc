#include <iostream>
#include <fstream>
#include <vector>
using namespace std;

int main() {
	ifstream ifs("euler8number.txt");
	vector<int> factors;
	vector<int> maxFactors;
	const int adjacentNumbers = 13;
	long product = 1;
	long maxProduct = 1;
	while ( !ifs.eof() ) {
		
		char charFactor;
		ifs >> charFactor;
		int intFactor = charFactor - '0';
		if ( intFactor == 0 ) {
			factors.clear();
			product = 1;
			continue;
		}
		product *= intFactor;
		factors.push_back(intFactor);
		
		if ( factors.size() > adjacentNumbers ) {
			product /= factors.front();
			factors.erase( factors.begin() );
		}
		
		if ( product > maxProduct ) {
			maxProduct = product;
			maxFactors = factors;
		}
		
	}
	for ( vector<int>::iterator it = maxFactors.begin(); it != maxFactors.end(); it++ ) {
		cout << *it << " ";
	}
	cout << endl << maxProduct << endl;
}