package edu.atria.oops.multithreading;

class Hii implements Runnable{
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println("Hiiii ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}


class Hello implements Runnable{
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println("Hello ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Multithreading {

	public static void main(String[] args)throws InterruptedException{
		
		Hii obj = new Hii();
		Hello obj1 = new Hello();
		
		Thread t1 = new Thread(obj);
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		try {
			Thread.sleep(300);
		}
		catch(InterruptedException e) {
			
		}
		
		Thread t2 = new Thread(obj1);
		t2.start();
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	}

}
