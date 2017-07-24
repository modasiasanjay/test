package thread_base;

class Check1 extends Thread{
		
	public void run() {
			for(int i=1;i<=5;i++){
				System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class Test1 {
		public static void main(String[] args) {
			Check1 ob = new Check1();
			Check1 ob1 = new Check1();
			ob.start();
			ob1.start();
			ob.interrupt();
			ob1.interrupt();
		}
}
