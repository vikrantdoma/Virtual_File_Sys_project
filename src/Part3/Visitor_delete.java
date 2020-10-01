package Part3;

public class Visitor_delete extends Visitor{
	

	@Override
	public void visit (textfile fil, FileSystem x){
		fil.setSize(0);
		fil.setName("NULL");
		
	}
	
	@Override
	public void visit (Directory dir, FileSystem x){
		
		dir.getFileList().remove(x);
	}



}
