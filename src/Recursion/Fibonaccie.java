package Recursion;

public class Fibonaccie {

	public static void main(String[] args) {
		System.out.println(fib(10));
	}
	
	public static int fib(int no) {
		if(no==0)
			return no;
		else if(no==1 || no==2)
			return 1;
		else
			return fib(no-1)+fib(no-2);
	}
}
