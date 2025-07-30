package week_1;

public class Autoboxing_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pnum = 10;
		Integer wnum = pnum;
		System.out.println("Autoboxing from data_type to Object: " +wnum);
		int pnum2 = wnum;
		System.out.println("Unboxing from Object to data_types: " +pnum2);
	}

}
