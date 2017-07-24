package thread_base;

public class ThradIntrruptExample extends Thread{
	
	public void run(){  
		try{  
			Thread.sleep(1000);  
			System.err.println("task");  
		}catch(InterruptedException e){  
			throw new RuntimeException("Thread interrupted..."+e);  
			}  
		} 

	public static void main(String[] args) {
			ThradIntrruptExample ob = new ThradIntrruptExample();
				ob.start();
				try {
					ob.interrupt();
					System.out.println("Exception Handeled");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
		}
}
