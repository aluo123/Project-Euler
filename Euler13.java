import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Euler13 {
  public static void main( String [] args ) {
    File numbers = new File("euler13numbers.txt");
    double sum = 0;
    try {
      Scanner in = new Scanner(numbers);
      while(in.hasNextDouble()) {
        sum += in.nextDouble();
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println(sum);
  }
}