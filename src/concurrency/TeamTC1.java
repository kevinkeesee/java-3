package concurrency;

import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable {

    List<String> team = new ArrayList<>();

    //This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.  In the run method of this thread, print out the name of each student in your TA group, (starting with your TA).  There should be a pause of 1 second before each name is printed to the console.The name should then be pushed to the team List  After all the names have been pushed to this List, print out the entire list of all the students in your TA group. Don't forget your TA as well!  All of these steps should be done whenever the thread is started.  (i.e. it can be done directly in the run()method of the thread itself).  Kick off the thread in the Main class of the concurrency package.  
    public void run() {
    	System.out.print("\nMark Bennet, ");
    	team.add("Mark Bennet");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Cody Clark, ");
    	team.add("Cody Clark");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("John Bozarov, ");
    	team.add("John Bozarov");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Kevin Keesee, ");
    	team.add("Kevin Keesee");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Matthew Choat, ");
    	team.add("Matthew Choat");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Tyler G Clements, ");
    	team.add("Tyler G Clements");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Aaron White, ");
    	team.add("Aaron White");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Abram Joblonski, ");
    	team.add("Abram Jablonski");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Caleb Waters, ");
    	team.add("Caleb Waters");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Gotham Katta, ");
    	team.add("Gotham Katta");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Justin Cheng, ");
    	team.add("Justin Cheng");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Korey Brooks, ");
    	team.add("Korey Brooks");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("Sarah, ");
    	team.add("Sarah");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	System.out.print("and Zach.\n");
    	team.add("Zach");
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	for (int i = 0; i < team.size(); i++) {
    		System.out.println("* " + team.get(i));
    	}
    }
}