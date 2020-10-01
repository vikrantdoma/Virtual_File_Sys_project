package Part3;

public abstract class FileBuilder {

		//abstract class of Concrete file builder
	
	    protected ConcreteFileBuilder concreteFileBuilder;
	    
	    public void createNewConcreteBuilder() {
	    	concreteFileBuilder = new ConcreteFileBuilder();
	    	
	    }

		public void makeDirectory_mkdir(String cmd, String argument) {}
		
		public void createFile_create(String cmd, String argument1, String argument2) {}
		
		public void resize_resize(String cmd, String argument1, String argument2) {}
		
		public void size_size(String cmd, String argument) {}
		
		public void changedir_cd(String cmd, String argument) {}
		
		public void listout_ls(String cmd, String argument) {}
		
		public void delete_delete(String cmd, String argument) {}
		
		public void exit() {}
		

	
}
