package com.mythread.demos;

class Tortoise implements Runnable {
	@Override
	public void run() {
		for (int i=1; i<101;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Hare implements Runnable {
	@Override
	public void run() {
		for (int i=1; i<101;i++) {
			if(!(i==90)) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
			else {
				System.out.println(i+" "+Thread.currentThread().getName());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
		}
	}
	
	
	public static void main(String[] args) {
		Tortoise t= new Tortoise();
		Hare h= new Hare();
		
		Thread r1=new Thread(t, "Tortoise");
		Thread r2=new Thread(h, "Hare");
		r1.start();
		r2.start();
		while(true) {
		if(r1.isAlive() && !(r2.isAlive())){
			System.out.println("Congrats Hare!!!! You've won");
			r1.stop();
			break;
		}
		if(r2.isAlive() && !(r1.isAlive())) {
			System.out.println("Congrats Tortoise!!! You've won");
			r2.stop();
			break;
		}
		}
	}
}
