package Recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	
	public static int fact(int no) {
		if(no==1)
			return no;
		else
			return no*fact(no-1);
	}
}
