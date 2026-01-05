package multithread;//thread is a predefined class
class Mythread extends Thread{
	int c=0;
	public void run() {
		try {
			Thread.sleep(2000);//this leads work the thread one by one after completing one another
			for(int i=0;i<=10;i++) {
				System.out.println(c++);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Mythread1 extends Thread{
	int c=11;
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.println(++c);
		}
	}
}
class Myrunnable implements Runnable{
	int c=21;
	public void run() {
		for(int i=21;i<=30;i++) {
			System.out.println(++c);
		}
	}
}
public class Threads {

	public static void main(String[] args) {//two ways of creating thread
		Mythread m=new Mythread();
		Thread t=new Thread(m);//using class
		t.start();
		Mythread1 m1=new Mythread1();
		m1.start();//using interface runnable
		Myrunnable r=new Myrunnable();
		Thread t1=new Thread(r);
		t1.start();
	}

}
