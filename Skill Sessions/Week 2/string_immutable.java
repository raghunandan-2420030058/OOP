package week_2;

public class string_immutable {
	
	public static void main(String[] args) {
	    String s1 = "Hello";
	    s1.concat(" Everyone"); 
	    System.out.println(s1); 

	    s1 = s1.concat(" Everyone");
	    System.out.println(s1); 
	}
}