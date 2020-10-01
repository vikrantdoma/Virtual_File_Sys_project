package Part3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class ConcreteFileBuilder  extends FileBuilder{
	
	private  ArrayList<FileSystem> list= new ArrayList<FileSystem>(); //array to store all directory and files
	private  Stack <FileSystem> filestack = new Stack <FileSystem>(); //array used for storing the current directory only (cd) will
	private  int listcounter; 
	
	public ConcreteFileBuilder() {
		Root root = Root.getInstance(); //create root initially and pushed to current working directory list filestack
		filestack.push(root);
		listcounter =0;
	}
    
	public void makeDirectory_mkdir(String cmd, String argument) { //mkdir fuction, get top of stack obj and add the new file 
		  list.add(new Directory(argument) );
		  filestack.peek().add(list.get(listcounter));
		  System.out.println("(adding "+list.get(listcounter).getName()+ " to "+filestack.peek().getName()+")");	     
		  this.listcounter+=1;
		  //System.out.println(filestack.peek());
		}
	
		  
	public void createFile_create(String cmd, String argument1, String argument2) { //same as mkdir
		  list.add(new textfile(argument1 , Integer.parseInt(argument2)));	  
		  filestack.peek().add(list.get(listcounter));
		  System.out.println("(adding "+argument1+ " to "+filestack.peek().getName()+")");
		  listcounter+=1;
		  //System.out.println(filestack.peek());
		}
		  
	public void changedir_cd(String cmd, String argument) { //pop stack if ".." , else push new directory to stack top
			//System.out.println("here");
	  	  
		  	  if (Objects.equals(argument, new String(".."))) {
		  		  filestack.pop();
		  		  System.out.println("(Stack top is now "+filestack.peek().getName()+")");
		  	  }
		  	  else {
		
		  		    for (FileSystem x : list) {
		  		        if (x.getName().equals(argument)) { 
		  		            System.out.println("(pushing "+x.getName()+")");;
		  		            filestack.push(x);
		  		            
		  		            break;
		  		        }
		  		    }		        		        		      
		  	  }
			
		}
	    
	  public void listout_ls(String cmd, String argument){ //ls command if file in list found display from that point
		  Visitor visit_file = new Visitor_ls();
		    for (FileSystem x : list) {
		        if (x.getName().equals(argument)) {
		        	//x.displayFiles();
		        	x.accept(visit_file);
		            break;
		        }
		    }
		  
		  
		  }
	  public void delete_delete(String cmd, String argument) {
		  
		  Visitor visit_file = new Visitor_delete();
		    for (FileSystem x : list) {
		        if (x.getName().equals(argument)) { 
		            System.out.println("(removing "+x.getName()+")");
		            //x.accept(visit_file);
		        	//filestack.peek().accept(visit_file);
		            filestack.peek().accepttwo(visit_file, x);
		            x.accepttwo(visit_file, x);
		            System.out.println(filestack.peek().getName());
		            break;
		        }
		    }
		  
	  }
	  public void size_size(String cmd, String argument) { //size command if file in list found display total size by adding recursively
		  Visitor visit_file = new Visitor_size();
		    for (FileSystem x : list) {
		        if (x.getName().equals(argument)) {
		        	x.accept(visit_file);
		        	//System.out.println("(size of file "+x.accept(visit_file, x)+")");		            
		            break;
		        }
		    }
		    
	  }
	  
	  public void resize_resize(String cmd, String argument1, String argument2) {
		  Visitor visit_file = new Visitor_resize();
		    for (FileSystem x : list) {
		        if (x.getName().equals(argument1)) {
		        	x.acceptRe(visit_file, argument2);
		        	//System.out.println("(size of file "+x.accept(visit_file, x)+")");		            
		            break;
		        }
		    }
	  }
	  
	  
	  public void exit(String cmd) {
		  Visitor visit_file = new Visitor_Exit();
		    }
		    
	  
	  
	 
}
