package Recursion;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("Java"));
	}

	public static String reverse(String str) {
	
		if(str.isEmpty() || str.length()==1)
			return str;
		else
			return reverse(str.substring(1))+str.charAt(0);
	}
}
