
/**
	User defined Threads extends from Thread class

*/
class ThreadDemo extends Thread{

	
	/**
		
	run() used to run logic of thread
	
	*/
	public void run(){
	
	System.out.println("Welcome to Thread Concept");
	
	}
	
	
	/**
	main method is used by JVM to execute the Java API
	*/
	public static void main(String []ar){
	

	/**
	ThreadDemo is a class to create an object for accessing the ThreadDemo class members
	*/
	ThreadDemo td=new ThreadDemo();
	

	/**
	It is a main Thread class expecting user defined thread class to attach for executing the User defined Threads 
	*/
	Thread t=new Thread(td);
	

	/**
	start() is a method of logic to run the concepts of the run() method execution
	*/
	t.start();
	
		
	}

}