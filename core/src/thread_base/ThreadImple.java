package thread_base;

class Asd extends Thread {
	 int x1;

	 Asd(int x){
		start();
		x1 = x;
	}
	synchronized public void run(){
		for(int i = 0 ; i<=20 ; i++){
			System.out.println("Tharead is ::"+getName()+"  "+i);
			try{
			//Thread.sleep(x1);
				wait();
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class Qwerty implements Runnable {
	public void run(){
		for(int i = 0 ; i<5 ; i++){
			System.out.println("Process is::"+i);
		}
	}
}
public class ThreadImple {
	public static void main(String[] args) {
		Asd ob = new Asd(500);
		Qwerty q = new Qwerty();
		Thread t = new Thread(q);
		t.start();
	//	Asd ob1 = new Asd(1000);		
		
	}
}
