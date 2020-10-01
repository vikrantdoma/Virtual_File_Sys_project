package Part3;

public class TreeDisplay { //acting as client
	
	
	public void getdisplay() {
		Root root = Root.getInstance(); 
	    Tree_accessor_delegate filedisp = new Directory_tree_display(root);
	    
	    filedisp.display(); 
	}

}
