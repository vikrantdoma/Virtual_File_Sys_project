package Part3;

import java.util.ArrayList;

public class ConcreteFileSubject  extends FileSubject{
	
	
	    private ArrayList<Observer> observers = new ArrayList<>(); //maintain list of observers
	    private int state;

	    public textfile getState() { //observer uses this to get the update
	        afile.setSize(Integer.parseInt(args));
	        
	        return afile;
	    }

	    public void setState(textfile fil,String argument) { //storing arguments as private members
	        this.afile = fil;
	        this.args = argument;
	        exec();				//notify all the observers to update
	    }

	    private void exec() {
	        for (Observer observer : observers) { 
	            observer.update();
	        }
	    }

		@Override
		public void add(Observer o) { //observers added to subjects list of observers 
			observers.add(o);
			
		}
	

}
