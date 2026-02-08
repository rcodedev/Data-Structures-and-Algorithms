package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		TDA tda = new TDA(3, 3);
		tda.insertion(0, 0, 5);
		tda.insertion(0, 1, 1);
		tda.insertion(0, 2, 6);
		tda.insertion(1, 0, 7);
		tda.insertion(1, 1, 3);
		tda.insertion(1, 2, 2);
		tda.insertion(2, 0, 55);
		tda.insertion(2, 1, 53);
		tda.insertion(2, 2, 25);
		System.out.println();
		tda.traverse();
		System.out.println();
		tda.searchByIndex(1, 1);
		System.out.println();
		tda.searchByValue(55);
		System.out.println();
		tda.deleteByIndex(0, 0);
		System.out.println();
		tda.deleteByValue(2);
		System.out.println();
		tda.traverse();
	}
}

class TDA{
	int[][] arr;
	public TDA(int rowSize, int colSize) {
		arr=new int[rowSize][colSize];
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col]=Integer.MIN_VALUE;
			}
		}
	}
	public void insertion(int row, int col, int value) {
		try {
			if(arr[row][col]==Integer.MIN_VALUE) {
				arr[row][col]=value;
				System.out.println("The value "+value+" is inserted");
			}
			else 
				System.out.println("The block is filled");			
		}
		catch (Exception e) {
			System.out.println("Invalid Index");
		}
	}
	public void traverse() {
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) 
				System.out.print(arr[row][col]+" ");
			System.out.println();
		}	
	}
	public void searchByIndex(int row, int col) {
		try {
			if(arr[row][col]!=Integer.MIN_VALUE) 
				System.out.println("The value is "+ arr[row][col]);			
			else 
				System.out.println("The block is empty");					
		}
		catch (Exception e) {
			System.out.println("Invalid Index");
		}
	}	
	public void searchByValue(int value) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==value) {
					System.out.println( "The value " + value + " is present at index [" + i + "][" + j + "]");
					found = true;
				}				
			}			
		}	
		 if (!found) 
		        System.out.println("Value not found");	    
	}
	public void deleteByValue(int value) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==value) {
					arr[i][j]=Integer.MIN_VALUE;
					System.out.println("Value is deleted successfully");
				}	
			}
		}
	}
	public void deleteByIndex(int row, int col) {
		try {
			if(arr[row][col]!=Integer.MIN_VALUE) {
				arr[row][col]=Integer.MIN_VALUE;
				System.out.println("The value is deleted");
			}
			else 
				System.out.println("The block is empty");			
		}
		catch (Exception e) {
			System.out.println("Invalid Index");
		}
	}
}