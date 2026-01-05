package multithread;
class MyThread extends Thread{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getState());
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class ThreadProcess {

	public static void main(String[] args) throws InterruptedException {
		MyThread m=new MyThread();
		System.out.println(m.getState());
		m.start();
		System.out.println(m.getState());
		Thread.sleep(500);
		System.out.println(m.getState());
		m.join();
		System.out.println(m.getState());
	}

}
