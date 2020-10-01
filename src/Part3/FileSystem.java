package Part3;
//This acts as an interface for file (Leaf) and directory (component)

public interface FileSystem {
	
	void accepttwo(Visitor v, FileSystem newFilesystem);
	
	void accept(Visitor v);
	
	void acceptRe(Visitor v, String argument2);

	public void add(FileSystem newFilesystem);
	
	
	public FileSystem getFileSystem (int componentIndex);
	
	public String getName ();
	
	public int getSize (); 
	
	public void displayFiles ();
	
}
