package concurrency;

import java.util.ArrayList;
import java.util.Random;

class Sync extends Thread {
    ArrayList<Object> nums = new ArrayList<>();

    Sync(String name) {
        super(name);
    }

    @Override 
    public void run() {
        synchronized(this) {
        	Random rand = new Random();
        	
        	for(int i=0; i<100; i++) {
                int randInt = rand.nextInt(100);
                this.nums.add(randInt);
            }
        	
        	System.out.println(nums);
        }
    }

    public static void main(String[] args)  {
        Sync syncThread = new Sync("sync thread");
        syncThread.start();
    }
}