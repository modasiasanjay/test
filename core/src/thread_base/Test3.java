package thread_base;

class Check3 extends Thread {
	synchronized void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread1 extends Thread {
	Check3 t;

	MyThread1(Check3 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	Check3 t;

	MyThread2(Check3 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class Test3 {
	public static void main(String[] args) {
		Check3 obj = new Check3();

		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
