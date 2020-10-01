package Part3;

//singleton class
public class Root extends Directory{

		// TODO Auto-generated constructor stub
		
	    private static Root single_instance = null; 
	    
	  
	    // private constructor restricted to this class itself 
	    private Root(String s) 
	    { 
	    	super(s);
	    	//FileSystem root = new Directory("root");
	    } 
	  
	    // static method to create instance of Singleton class 
	    public static Root getInstance() 
	    { 
	        if (single_instance == null) 
	            single_instance = new Root("root"); 
	  
	        return single_instance; 
	    } 
	 
	}


