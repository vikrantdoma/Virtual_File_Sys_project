package Part3;

public class Visitor_resize extends Visitor{

//acting as a client to observer pattern
	@Override
	public void visit(textfile fil, String argument2) {
		FileSubject fsubject = new ConcreteFileSubject();
		new FileResizeObserver(fsubject); //invoke concrete observer
		
		fsubject.setState(fil,argument2); //update the concrete observer with 1) textfile and 2)resize value
		
		TreeDisplay newtreedisp = new TreeDisplay();
		newtreedisp.getdisplay();
		
		
	}

}
