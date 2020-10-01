package Part3;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
import java.util.Stack;



public class FileSystemCreator {
	
	public static void main(String[] args){

		      File myObj = new File("/home/vikmachine/eclipse-workspace/Part3/script2.txt");      
		      FileDirector file_driver = new FileDirector();
		      file_driver.CreateFilebuilder( myObj);
	
	}


	

}
