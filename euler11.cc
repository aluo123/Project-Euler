#include <fstream>
#include <iostream>
#include <cstdlib>
using namespace std;

int greatestProduct( int gridWidth, int gridLength, int adjacentNumbers, const char source[] ) {
	int grid[gridWidth][gridLength];
	ifstream ifs(source);
	for ( int row = 0; row < gridLength; row++ ) {
		for ( int col = 0; col < gridWidth; col++ ) {
			int input;
			ifs >> input;
			grid[row][col] = input;
		}
	}
	
	int maxProduct = 0;
	int row = 0;
	int col = 0;
	int productUp = 1;
	int productRight = 1;
	int productFDiag = 1;
	int productBDiag = 1;
	
	while ( row < gridLength ) {
		if ( col < gridWidth - adjacentNumbers ) {
			productRight = 1;
			for ( int i = 0; i < adjacentNumbers; i++ ) {
				productRight *= grid[row][col + i];
			}
			if ( productRight > maxProduct ) {
				maxProduct = productRight;
				cout << row << " " << col << " " << maxProduct << " Right" << endl;
			}
		}
		
		if ( row < gridLength - adjacentNumbers ) {
			productUp = 1;
			for ( int i = 0; i < adjacentNumbers; i++ ) {
				productUp *= grid[row + i][col];
			}
			if ( productUp > maxProduct ) {
				maxProduct = productUp;
				cout << row << " " << col << " " << maxProduct << " Up" << endl;
			}
		}
		
		if ( row < gridLength - adjacentNumbers && col < gridWidth - adjacentNumbers ) {
			productFDiag = 1;
			for ( int i = 0; i < adjacentNumbers; i++ ) {
				productFDiag *= grid[row+i][col+i];
			}
			if ( productFDiag > maxProduct ) {
				maxProduct = productFDiag;
				cout << row << " " << col << " " << maxProduct << " FDiag" << endl;
			}
		}
		
		if ( row >= adjacentNumbers && col < gridWidth - adjacentNumbers ) {
			productBDiag = 1;
			for ( int i = 0; i < adjacentNumbers; i++ ) {
				productBDiag *= grid[row-i][col+i];
			}
			if ( productBDiag > maxProduct ) {
				maxProduct = productBDiag;
				cout << row << " " << col << " " << maxProduct << " BDiag" << endl;
			}
		}
		
		col++;
		if ( col == gridWidth ) {
			row++;
			col = 0;
		}
	}
	
	return maxProduct;
}

int main(){
	string source = "euler11grid.txt";
	cout << greatestProduct( 20,20,4, source.c_str() ) << endl;
}