package Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		SDA S= new SDA(5);
		S.insertion(0, 10);
		S.insertion(1, 20);
		S.insertion(2, 30);
		S.insertion(3, 40);
		S.insertion(4, 50);
		S.insertion(5, 60);
		System.out.println();
		S.traverse();
		System.out.println();
		S.SearchByValue(20);
		System.out.println();
		S.SearchByIndex(3);
		System.out.println();
		S.DeleteByValue(40);
		System.out.println();
		S.traverse();
		System.out.println();
		S.DeleteByIndex(4);
		System.out.println();
		S.traverse();
	}

}

class SDA{
	int[] arr;
	public SDA(int size) {
		this.arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	public void insertion(int index, int value) {
		try {
			if(arr[index]==Integer.MIN_VALUE) {
				arr[index]=value;
				System.out.println("The Value "+value+" is inserted");
			}
			else {
				System.out.println("The Cell is already filled");
			}
		}
		catch (Exception e) {
			System.out.println("The Cell is already filled");
		}		
	}
	
	public void traverse() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+" "+arr[i]);
		}
	}
	
	public void SearchByValue(int search) {
		try {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==search) {
					System.out.println("The Value is present in the index of: "+i);
					return;
				}
			}
			System.out.println("The value is not Present");
		}
		catch (Exception e) {
			System.out.println("Invalid value");
		}
	}
	
	
	public void SearchByIndex(int index) {
		try {
			if(arr[index] != Integer.MIN_VALUE) {
				System.out.println("The Value "+arr[index]+" is present");
			}
			else{
				System.out.println("The call is Empty");
			}
		}
		catch (Exception e) {
			System.out.println("Invalid Index");
		}		
	}
	
	public void DeleteByValue(int search) {
		try {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==search) {
					arr[i]=Integer.MIN_VALUE;
					System.out.println("The Value is Deleted ");
					return;
				}
			}
			System.out.println("The value is not Present");
		}
		catch (Exception e) {
			System.out.println("Invalid value");
		}
	}
	
	public void DeleteByIndex(int index) {
		try {
			if(arr[index] != Integer.MIN_VALUE) {
				arr[index]=Integer.MIN_VALUE;
				System.out.println("The Value is Deleted");
			}
			else{
				System.out.println("The call is Empty");
			}
		}
		catch (Exception e) {
			System.out.println("Invalid Index");
		}		
	}
}