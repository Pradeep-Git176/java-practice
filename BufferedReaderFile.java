package april;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Reading from FileReader using BufferedReader Class (class is available in java.io package)
public class BufferedReaderFile {

	// Reading from FileReader using BufferedReader Class
	public static void main(String[] args) throws IOException
		{

			// File path
			FileReader file = new FileReader("C:\\Users\\DELL\\Desktop\\New folder\\mariadb.txt");
			
			// Creating an object of BufferedReader class
			BufferedReader br= new BufferedReader(file);

			// Declaring a string variable for stored the data
			String data;
			
			// buffered reader always return data in strig
			while ((data = br.readLine()) != null)

				// Print the string
				System.out.println(data);
		}


	}

	



