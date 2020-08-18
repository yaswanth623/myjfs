package com.mythread.demos;

class Thread1 implements Runnable{

@Override
public void run() {
System.out.println("THREAD 1 CLASS "+Thread.currentThread().getName());
}
}


class ThreadDemo1 implements Runnable{

@Override
public void run() {
System.out.println(Thread.currentThread().getName());
}


public static void main(String[] args) {

ThreadDemo1 demo1=new ThreadDemo1();
Thread1 thd1=new Thread1();


Thread t1=new Thread(demo1,"my thread");
Thread t2=new Thread(thd1,"new Thread");
t1.start();
t2.start();

}
}

