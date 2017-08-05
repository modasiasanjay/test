package exe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Student {
	String name;
	int rollNo;
	String department;
	
	public Student(String name,int rollNo,String department){
		this.name=name;
		this.rollNo=rollNo;
		this.department=department;
	 }
		@Override
		public int hashCode(){
			return rollNo;
		}
		
		@Override
		public boolean equals(Object obj)
	    {
	        Student student = (Student) obj;
	        return (rollNo == student.rollNo);
	    }
	    @Override
	    public String toString()
	    {
	        return rollNo+", "+name+", "+department;
	    }
		
	    public static void main(String[] args) {
			HashSet<Student> set = new HashSet<Student>();
			set.add(new Student("sanjay",21,"CS"));
			set.add(new Student("Avinash", 121, "ECE"));
	        set.add(new Student("Bharat", 101, "EEE"));
	        set.add(new Student("Malini", 151, "Civil"));
	        set.add(new Student("Suresh", 200, "IT"));
	        set.add(new Student("Vikram", 550, "CS"));
	        set.add(new Student("Bharat", 301, "IT"));
	        set.add(new Student("Amit", 301, "IT"));           //duplicate element
	        set.add(new Student("Bhavya", 872, "ECE"));
	        set.add(new Student("Naman", 301, "CS"));        //duplicate element
	        set.add(new Student("Samson", 565, "Civil"));
	        
	        Iterator<Student> it = set.iterator();
	        while (it.hasNext())
	        {
	            Student student = (Student) it.next();
	 
	            System.out.println(student);
	        }
		}
	}

