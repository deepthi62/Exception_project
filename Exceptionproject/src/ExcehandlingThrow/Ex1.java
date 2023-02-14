package ExcehandlingThrow;

public class Ex1 {

	public static void main(String[] args) {
		String name = "70";
		int n1 = 20;
		int n2 = 0;
		int[]namearray = new int[5];
		try {
		
		int namestring1 = Integer.parseInt(name);
		System.out.println(namestring1);
		try {
		
		int n3 = n1/n2;
		System.out.println(n3);
		try {
			System.out.println(namearray[6]);
		}
		catch(ArrayIndexOutOfBoundsException ary){
			System.out.println(ary);
	}
     	}
		catch(NumberFormatException ae) {
			System.out.println(ae);
		}
    }
		catch(ArithmeticException e) {
			System.out.println(e);
		
		}catch(Exception e) {
			System.out.println("--------");
			System.out.println("exception");
			System.out.println("aaaaaaa");
		  } 
	}
}

	


