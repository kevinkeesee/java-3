package concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. 
	void distinguish() {
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
    	
    	System.out.println("A thread is merely a part of a process, and a process can contain many threads.");
    	System.out.println("If you call run() instead of start(), it will just call the method directly and won't be properly multithreaded.");
    }
	
	public void run() {
		distinguish();
	}
    
}