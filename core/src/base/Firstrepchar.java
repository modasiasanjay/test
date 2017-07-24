
package base;

import java.util.Scanner;

public class Firstrepchar {
	static Scanner sn = new Scanner(System.in);
    static String word = sn.nextLine();
	
	public static void main(String[] args) {
		System.out.println("Result is::"+check(word));
	} 
	private static String check(String word){
		String store = "";
		for(int i=0; i<word.length();i++) {
			if(store.indexOf(word.charAt(i))<0){
				store = store + word.charAt(i);
			}else{
				return word.charAt(i) + " at position " + i;
			}
		}
		 System.out.println("Result word " + store);
	        return "nothing found";
	}
}
