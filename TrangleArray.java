import java.io.*;
import java.util.Scanner;

public class TriangleArray {
    private int[][]arr;
    //Takes a file of numbers aligned in a triangular and puts them 
    // into a triangular array
    public TriangeArray( String s ) throws IOException  {
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
    
}