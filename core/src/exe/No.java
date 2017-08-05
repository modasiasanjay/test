package exe;

class Parent1{  
	  void msg()throws Exception{
		  System.out.println("parent");}  
	}  
	public class No extends Parent1{  
			 
		void msg()throws ArithmeticException{
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]){  
	   Parent1 p1=new No();  
	   
	   try {
		p1.msg();
	   } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
  }  
} 
