package Part3;

public abstract class FileSubject {

	protected textfile afile;
	protected String args;
	abstract void add(Observer o);
	abstract void setState(textfile fil,String argument);
	protected abstract textfile getState();

}
