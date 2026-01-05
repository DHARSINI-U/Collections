package multithread;
class counter{
	int count=0;
	synchronized void increment() {
		count++;
	}
}
class MYthread extends Thread{
	counter c;
	MYthread(counter c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<=1000;i++) {
			c.increment();
		}
	}
}
public class Synchronization {

	public static void main(String[] args)throws InterruptedException {
		counter c1=new counter();
		MYthread m1=new MYthread(c1);
		MYthread m2=new MYthread(c1);
		m1.start();
		m2.start();
		m1.join();
		m2.join();
		System.out.println(c1.count);
		
	}

}
