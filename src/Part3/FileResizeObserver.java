package Part3;

public class FileResizeObserver extends Observer{
	
	private textfile upfile;
	public FileResizeObserver(FileSubject fsubject) {
		this.filesubject= fsubject;
		this.filesubject.add(this); //added to concrete file subject 
	}

	@Override
	public void update() { //on update will call concrete subject to update.
		
		upfile=filesubject.getState();
		System.out.println("(resizing "+upfile.getName()+" to "+upfile.getSize()+")");
		
	}

}
