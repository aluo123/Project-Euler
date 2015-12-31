public class Euler10
{
  public static void main(String[] args)
  {
    final int cap = 2000000;
    boolean[] sieve = new boolean[cap];
    for ( int i = 2; i < cap; i++ )
    {
      sieve[i] = true;
    }
    
    for ( int j = 2; j < cap; j++ ) 
    {
      if ( sieve[j] )
      {
        for ( int k = j + 1; k < cap; k++ )
        {
          if ( k % j == 0 )
          {
            sieve[k] = false;
          }
        }
      }
    }
    
    long sum = 0;
    for ( int l = 2; l < cap; l++ )
    {
      if ( sieve[l] )
      {
        sum += l;
      }
    }
    
    System.out.println(sum);
    
  }
}
