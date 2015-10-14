import java.util.Scanner;
import java.io.*;

public class MaxSumPath {
    public static void main( String[] args ) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a triangular file name: ");
        String fileName = input.next();
        int [][]numbers = readArray(fileName);
        int sums[][] = new int[numbers.length][];
        for ( int i = 0; i < numbers.length; i++ ) {
            sums[i] = new int[numbers[i].length];
        }
        System.out.println(calculateMaxSum(sums, numbers, 0, 0));
    }
    
    public static int calculateMaxSum( int [][] sums, final int [][] numbers, int row, int col ) {
        if ( row >= numbers.length || col >= numbers[row].length ) {
            return 0;
        }
        if ( sums[row][col] != 0 ) {
            return sums[row][col];
        }
        sums[row][col] = numbers[row][col] + 
            Math.max(calculateMaxSum( sums, numbers, row+1, col ),
        calculateMaxSum( sums, numbers, row+1, col+1));
        return sums[row][col];
    }
    
    //Takes a file of numbers aligned in a triangular and puts them 
    // into a triangular array
    public static int[][] readArray( String s ) throws IOException  {
        int lines = countLines(s);
        Scanner file = new Scanner(new File(s));
        int [][] fileNumbers = new int[lines][];
        for ( int i = 0; i < lines; i++ ) {
            fileNumbers[i] = new int[i+1];
            for ( int j = 0; j < fileNumbers[i].length; j++ ) {
                fileNumbers[i][j] = file.nextInt();
            }
        }
        return fileNumbers;
    }
    
    //Counts the lines in a file
    private static int countLines( String s ) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader(s) );
        int lines = 0;
        while( br.readLine() != null ) {
            lines++;
        }
        return lines;
    }
}