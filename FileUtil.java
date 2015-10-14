import java.io.*;

public class FileUtil {
    //Counts the lines in a file
    public static int countLines( String s ) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader(s) );
        int lines = 0;
        while( br.readLine() != null ) {
            lines++;
        }
        return lines;
    }
}