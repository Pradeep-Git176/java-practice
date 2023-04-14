package april;

import java.io.FileReader;
import java.io.IOException;

public class FileReaders {
	public static void main(String[] args) throws IOException
    {
 
        // File path
        FileReader file = new FileReader("C:\\Users\\DELL\\Desktop\\New folder\\mariadb.txt");
 
        int i;
        // Holds true till there is nothing to read
        while ((i = file.read()) != -1)
 
            // Print all the content of a file
            System.out.print((char)i);
    }
}


