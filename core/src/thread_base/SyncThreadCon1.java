package thread_base;


class Abc extends Thread{
	synchronized void print(int q){
			for(int i=1;i<5;i++){
				System.out.println(getName()+":"+i*q);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class SyncThreadCon1 {
	public static void main(String[] args) {
		Abc obj = new Abc();
		Abc obj1 = new Abc();
		
		Thread ob = new Thread(){
		    public void run(){
				obj.print(5);
			}
		};
		Thread ob1 = new Thread(){	
			public void run(){
				obj1.print(100);
			}
		};

		ob1.start();
		ob.start();
	}
}
