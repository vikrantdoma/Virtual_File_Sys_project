package Part3;

public class Directory_tree_display implements Tree_accessor_delegate{ //adapter
	
	FileSystem filesys;
	
	public Directory_tree_display(FileSystem filesys) {
		this.filesys=filesys; //getting reference to the object to adapt
	}
	
	public void display(){
		
		System.out.println("(Displaying file Hierarchy)");
		filesys.displayFiles(); //calling filesystem (adaptee)
		System.out.println("\n");
	}

}
