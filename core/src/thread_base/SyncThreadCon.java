package thread_base;

class A extends Thread{
	
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
class B extends A{
	A ref1;
	B(A ref1){
		start();
		this.ref1=ref1;
	}
	
    public void run(){
		ref1.print(5);
	}
}
class C extends Thread{
	A ref2;
	C(A ref2){
		this.ref2=ref2;
	}
	
	 public void run(){
		ref2.print(100);
	}
}
public class SyncThreadCon {
	public static void main(String[] args) {
		A obj = new A(); 
		A ob = new B(obj);// Only One Object
		C ob2 = new C(ob);
		ob2.start();
		C ob3 = new C(ob);
		ob3.start();
		
		//A obj1 = new A();
	  //	A ob1 = new B(obj);
		/*A obc = new A();*/  
		

		/*B ob3 = new B(obc);
		C ob4 = new C(obc);*/
		//ob1.start();
		/*ob4.start();
		ob3.start();*/
	}
}
