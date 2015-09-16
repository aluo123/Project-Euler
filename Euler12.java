public class Euler12 {
  
  public static void main(String [] args) {
    int i = 2;
    int triNum = 1;
    while ( numDivisors(triNum) <= 500 ) {
      triNum += i;
      i++;
    }
    System.out.println(triNum);
  }
  
  static int numDivisors( int n ) {
    int divisors = 1;
    int prime = 2;
    int occurrence = 1;
    while ( n != 1 ) {
      if ( n % prime == 0 ) {
        occurrence++;
        n /= prime;
      }
      else {
        divisors *= occurrence;
        prime++;
        occurrence = 1;
      }
    }
    divisors *= occurrence;
    return divisors;
  }
}