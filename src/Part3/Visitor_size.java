package Part3;

import java.util.Iterator;

public class Visitor_size extends Visitor{

	
	
	public void visit(Directory dir) {
		int total=0;
		Iterator fileIterator = dir.getFileList().iterator();
		while(fileIterator.hasNext()) {
		
			FileSystem files= (FileSystem) fileIterator.next();
			total=total+files.getSize();
			}
		
		System.out.println("(size of file "+total+")");	
		
		
	}

	@Override
	public void visit(textfile fil) {
		
		System.out.println("(size of file "+fil.getSize()+")");	
		
	}

}
