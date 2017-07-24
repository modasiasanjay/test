package thread_base;

class Syn1 extends  Thread{
	static int a=5;
	synchronized public void  run(){
		for(int i=0;i<5;i++){
			a++;
			System.out.println(getName()+" "+i+" Value of  a is :"+a);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
				}
			}
		}
	}
public class Test4Sync {
	public static void main(String[] args) {
		Syn1 ob1 = new Syn1();
		Syn1 ob2 = new Syn1();
		ob1.start();
		ob2.start();
	}
}
