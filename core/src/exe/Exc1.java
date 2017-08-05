package exe;

import java.io.IOException;

class Exc1{  
	 void method()throws IOException{
		// System.out.println("hiiiiiii");
	   throw new IOException("device error");  
	 }  
	}  
	class Testthrows4{  
	   public static void main(String args[])throws IOException{//declare exception  
		   Exc1 m=new Exc1();  
		   m.method();  
		  
		  System.out.println("normal flow...");  
	  }  
	} 