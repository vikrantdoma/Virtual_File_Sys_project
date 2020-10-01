package Part3;
import java.util.ArrayList;
import java.util.Iterator;
	 

public class Directory implements FileSystem{

	private ArrayList filelist = new ArrayList();
	private String dirName;
	
	
	public Directory(String dirName) {
		this.dirName=dirName;
		
		
	}
	
	public String getName() {return dirName;}
	
	public  ArrayList getFileList() {return filelist;}
	
	public void add(FileSystem newFilesystem) {
		
		filelist.add(newFilesystem);
	}
	
	public FileSystem getFileSystem (int componentIndex) {
		
		return (FileSystem)filelist.get(componentIndex);
	}
	
	public int getSize() { // get size will recursively call getsize in file and directory in a cascade fashion, each time returning 'total' or 'size'
			
		int total=0;
		Iterator fileIterator = filelist.iterator();
		while(fileIterator.hasNext()) {
		
			FileSystem files= (FileSystem) fileIterator.next();
			total=total+files.getSize();
			}
		
		return total;
	}
	
	public void displayFiles() { //same for display if file is a directory new filelist iterator will iterate over sub directories
		
		System.out.println("(Folder: "+getName() + ")");
		
		Iterator fileIterator = filelist.iterator();
		while(fileIterator.hasNext()) {
		
			FileSystem files= (FileSystem) fileIterator.next();
			files.displayFiles();
			}
	}




	@Override
	public void accepttwo(Visitor v, FileSystem x) {
		v.visit(this, x);
		
		;
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

	@Override
	public void acceptRe(Visitor v, String argument2) {
		// TODO Auto-generated method stub
		
	}



}
	

