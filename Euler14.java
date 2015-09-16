public class Euler14 {
  static final int limit = 1000000;
  //Stores length calculations so no repeats need to happen
  static int [] lens = new int[limit];
  
  public static void main( String [] args ) {
    int max = 1;
    int startMax = 1;
    for ( int i = 1; i < limit; i++ ) {
      lens[i] = -1;
    }
    lens[0] = 1;
    int n = 1;
    while ( n < limit ) {
      int chain = collatzLen(n);
      if ( chain > max ) {
        max = chain;
        startMax = n;
      }
      n++;
    }
    System.out.println(startMax + ":" + max);
  }
  
  //Returns the length of the collatzLen
  static int collatzLen( long n ) {
    //If a number is in the array, attempts to see if the length has previously been found
    if ( n < limit ) {
      int index = (int) n-1;
      if ( lens[index] != -1 ) {
        return lens[index];
      }
      if ( n % 2 == 0 ) {
        lens[index] = 1 + collatzLen(n/2);
        return lens[index];
      }
      else {
        lens[index] = 1 + collatzLen(3*n + 1);
        return lens[index];
      }
    }
    else {
      if ( n % 2 == 0 ) {
        return 1 + collatzLen(n/2);
      }
      else {
        return 1 + collatzLen(3*n + 1);
      }
    }
  }
    
}