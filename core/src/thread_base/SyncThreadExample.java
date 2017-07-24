package thread_base;

class P{
	
	int amount = 10000;
	synchronized void withdraw(int amount){
		System.out.println("Ready to withdraw");
		if(this.amount<amount){
			System.out.println("You have less amount");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount  = this.amount - amount;
		System.out.println("withdraw completed");
	}
	
	synchronized void deposit(int amount){
		System.out.println("Going to deposite");
		this.amount  = this.amount + amount;
		System.out.println("deposite completed");
		notify();
	}
}
public class SyncThreadExample {
	public static void main(String[] args) {
	final P ob = new P();
		new Thread(){  
			public void run(){ob.withdraw(15000);}  
		}.start();  
			
		new Thread(){  
			public void run(){ob.deposit(10000);}  
		}.start();  
	}
}
