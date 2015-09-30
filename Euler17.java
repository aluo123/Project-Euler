import java.util.Scanner;

public class Euler17 {
    static int [] ones = {3,3,5,4,4,3,5,5,4};
    static int [] teens = {6,6,8,8,7,7,9,8,8};
    static int [] tens = {3,6,6,5,5,5,7,6,6};
    static final int HUNDRED = 7;
    static final int HUNDRED_AND = 10;
    
    public static void main(String[] args) {
        int totalLetters = 0;
        for ( int i = 1; i < 1000; i++ ) {
            totalLetters += lettersUsed(i);
            System.out.println(i);
        }
        System.out.println(totalLetters);
    }
    
    static int lettersUsed( int n ) {
        int letters = 0;
        if ( n / 100 > 0 ) {
            letters += ones[(n / 100) - 1];
            if ( n % 100 == 0 ) {
                letters += HUNDRED;
                return letters;
            }
            letters += HUNDRED_AND;
            n %= 100;
        }
        if ( n / 10 > 0 ) {
            if ( n % 10 == 0 ) {
                letters += tens[(n/10) - 1];
                return letters;
            }
            if ( n / 10 == 1 ) {
                letters += teens[(n%10)-1];
                return letters;
            }
            letters += tens[(n/10)-1];
            n %= 10;
        }
        letters += ones[n-1];
        return letters;
    }
}
    
