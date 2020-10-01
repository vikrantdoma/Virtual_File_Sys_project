package Part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class FileDirector {
	
	String arg1;
	String arg2;
	String arg3;
	
	// class to parse the file get commands from the file and send them to the builder
	
	protected FileBuilder filebuilder;
    public void CreateFilebuilder(File myObj){
    	
    	filebuilder = new ConcreteFileBuilder(); //invoke constructor of concrete file builder
    	Scanner myReader;
		try {
			myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		        String[] commands = data.split(" "); //split the input string command and filename

		        
		        for (int i=0; i < commands.length; i++) {
		        	  String cmd = commands[i];
		        	  //each if else compares the line read with the command string and passes the 2nd or 3rd argument to concrete filebuilder
		          
		          if (Objects.equals(commands[i], new String("mkdir"))) {
		        	  String argument1 = commands[i+1];
		        	  this.makeDirectory_fn(cmd, argument1);
		          }
		          
		          if (Objects.equals(commands[i], new String("create"))) {
		        	  String argument1 = commands[i+1];
		        	  String argument2 = commands[i+2];
		        	  this.createFile_fn(cmd,argument1,argument2);
		          }
		          
		          if (Objects.equals(commands[i], new String("cd"))) {
		        	  String argument1 = commands[i+1];
		        	  this.changedir_fn(cmd, argument1);
		          }
		          
		          if (Objects.equals(commands[i], new String("ls"))) {
		        	  String argument1 = commands[i+1];
		        	  this.listout_fn(cmd, argument1);
		          }
		          
		          if (Objects.equals(commands[i], new String("del"))) {
		        	  String argument1 = commands[i+1];
		        	  this.deleteFile_fn(cmd, argument1);
		          }
		          if (Objects.equals(commands[i], new String("size"))) {
		        	  String argument1 = commands[i+1];
		        	  this.size_fn(cmd, argument1);
		          }
		          
		          if (Objects.equals(commands[i], new String("resize"))) {
		        	  String argument1 = commands[i+1];
		        	  String argument2 = commands[i+2];
		        	  this.resize_fn(cmd,argument1,argument2);
		        	  this.setparam1(argument2);
		          }
		          
		          if (Objects.equals(commands[i], new String("exit"))) {
		        	  filebuilder.exit();
		          }
		          
	          		        	  
		        }
			} 
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}       
    	
    }
    
    public String getparam2() {
    	return arg2;
    }
    
    public void setparam1(String argument1) {
    	String arg1=argument1;
    }
    
    public void setparam2(String argument2){
    	String arg2=argument2;
    }
	
	public void resize_fn(String cmd, String argument1, String argument2) {
		filebuilder.resize_resize(cmd , argument1, argument2);
		
	}

	public void makeDirectory_fn(String cmd, String argument) {
		
		filebuilder.makeDirectory_mkdir(cmd , argument);
	}
	
	public void createFile_fn(String cmd, String argument1, String argument2) {
		filebuilder.createFile_create(cmd , argument1, argument2);	
	}
	
	public void size_fn(String cmd, String argument) {
		filebuilder.size_size(cmd , argument);
	}
	
	public void changedir_fn(String cmd, String argument) {
		filebuilder.changedir_cd(cmd , argument);
	}
	
	public void listout_fn(String cmd, String argument) {
		filebuilder.listout_ls(cmd , argument);
	}

	public void deleteFile_fn(String cmd, String argument) {
		filebuilder.delete_delete(cmd , argument);
	}


    }

