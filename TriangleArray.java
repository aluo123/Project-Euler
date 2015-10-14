import java.io.*;
import java.util.Scanner;

public class TriangleArray {
    private int[][]arr;
    //Takes a file of numbers aligned in a triangular and puts them 
    // into a triangular array
    public TriangleArray( int length ) {
        int arr[][] = new int[length][];
        for ( int i = 0; i < length; i++ ) {
            arr[i] = new int[i+1];
        }
    }
    
    public TriangleArray( String s ) throws IOException  {
        int lines = FileUtil.countLines(s);
        Scanner file = new Scanner(new File(s));
        int [][] arr = new int[lines][];
        for ( int i = 0; i < lines; i++ ) {
            arr[i] = new int[i+1];
            for ( int j = 0; j < arr[i].length; j++ ) {
                arr[i][j] = file.nextInt();
            }
        }
    }
    
    public int getLength() {
        return arr.length;
    }
    
    public int getRowLength( int row ) {
        return arr[row].length;
    }
}