package Part3;

import java.util.Iterator;

public class Visitor_ls extends Visitor{


	@Override
	public void visit(Directory dir) {
		
		System.out.println("Folder: "+dir.getName() + " ");
		
		Iterator fileIterator = dir.getFileList().iterator();
		while(fileIterator.hasNext()) {
		
			FileSystem files= (FileSystem) fileIterator.next();
			files.displayFiles();
			}
		
	}

	@Override
	public void visit(textfile fil) {
		System.out.println("Filename: "+fil.getName()+" Filesize: "+fil.getSize());
		
	}

}
