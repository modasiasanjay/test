package thread_base;


class Check2 extends Thread{
	synchronized public void run(){
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName()+"="+i);
		}
	}
}
public class Test2 {
	public static void main(String[] args) {
		Check2 ob1 = new Check2();
		Check2 ob = new Check2();
		Check2 ob2 = new Check2();
		ob.setName("Hiii");
		ob1.setName("hello");
		ob2.setName("heyy");
		ob1.start();
		ob.start();
		ob2.start();
	}
}
