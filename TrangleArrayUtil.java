import java.io.*;

public class TrangleArray {
    int[][]arr;
    //Takes a file of numbers aligned in a triangular and puts them 
    // into a triangular array
    public static int[][] readArray( String s ) throws IOException  {
        int lines = FileUtil.countLines(s);
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
    
}