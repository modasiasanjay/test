package exe;


class Parent{  
	  void msg(){System.out.println("parent");}  
	}  
	public class Mn extends Parent{  
			 void msg()throws ArithmeticException{
		//	 void msg()throws IOException{                  //it can be apply on checked Exception 
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]){  
	   Parent p=new Mn();  
	   p.msg();  
	  }  
	}  