//Find the index of the first 1000 digit fibonacci number
import java.math.BigInteger;
public class Fibo1000 {
    public static void main( String[] args ) {
        BigInteger fib1 = new BigInteger("0");
        BigInteger fib2 = new BigInteger("1");
        BigInteger sum = new BigInteger("0");
        int fibCounter = 0;
        while ( fib1.toString().length() < 1000 ){
            BigInteger nextFib = fib1.add(fib2);
            fib1 = fib2;
            fib2 = nextFib;
            fibCounter++;
        }
        System.out.println(fibCounter);
    }
}