package Part3;

public class textfile implements FileSystem{
	
	private String fileName;
	private int size;
	
	public textfile (String filename, int size){
		this.fileName=filename;
		this.size=size;
		
	}
	
	public String getName() {return fileName;}
	
	public void setName(String filename) {
		this.fileName=filename;
	}
	
	public void setSize(int  size) {
		this.size=size;
	}
	
	public int getSize() {return size;}
	
	public void displayFiles() {
	System.out.println("(Filename: "+getName()+" Filesize: "+getSize()+")");
	}

	@Override
	public void add(FileSystem newFilesystem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FileSystem getFileSystem(int componentIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public void accepttwo(Visitor v, FileSystem x) {
		v.visit(this, x);
		
	}
	public void accept(Visitor v) {
		v.visit(this);
		
	}

	@Override
	public void acceptRe(Visitor v, String argument2) {
		v.visit(this,argument2);
		
	}






}
