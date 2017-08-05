package exe;

class V{  
public void finalize(){System.out.println("finalize called");}  
public static void main(String[] args){  
V f1=new V();  
V f2=new V();  
f1=null;
f2=null;
System.gc();  
}} 