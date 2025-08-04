package week_2;

public class string_manipulation {

	public static void main(String[] args) {

        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original String: " + original);    
        System.out.println("Modified String: " + modified);   

        System.out.println("Is original == modified? " + (original == modified)); 

        String sample = "  Java Programming  ";
        
        System.out.println("Length: " + sample.length());

        System.out.println("Trimmed: '" + sample.trim() + "'");

        System.out.println("Uppercase: " + sample.toUpperCase());
        System.out.println("Lowercase: " + sample.toLowerCase());

        System.out.println("Substring (5, 16): " + sample.substring(5, 16));

        System.out.println("Replace 'a' with '@': " + sample.replace('a', '@'));

        System.out.println("Starts with '  Ja': " + sample.startsWith("  Ja"));
        System.out.println("Ends with 'g  ': " + sample.endsWith("g  "));

        System.out.println("Index of 'a': " + sample.indexOf('a'));
        System.out.println("Last Index of 'a': " + sample.lastIndexOf('a'));

        System.out.println("Char at index 6: " + sample.charAt(6));

        System.out.println("Equals 'java programming': " + sample.trim().equals("java programming")); 
        System.out.println("EqualsIgnoreCase 'java programming': " + sample.trim().equalsIgnoreCase("java programming")); 
    }
}