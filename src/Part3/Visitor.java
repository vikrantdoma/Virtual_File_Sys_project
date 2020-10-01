package Part3;

public abstract class Visitor {
	void visit (Directory dir, FileSystem x) {}
	void visit (textfile fil, FileSystem x) {}
	
	void visit (Directory dir) {}
	void visit (textfile fil) {}
	void visit (textfile fil, String argument2) {}
	

}
