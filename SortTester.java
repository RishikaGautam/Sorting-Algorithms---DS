
public class SortTester {
	public static void main(String[] args) {
		// MergeSort.sort(randomArray(10,40)); //Test1
		 //MergeSort.sort(randomArray(8,30)); //Test2
 		 //MergeSort.sort(randomArray(13,10)); //Test3
		 //MergeSort.sort(randomArray(7,90)); //Test4
		 
		 //QuickSort.sort(randomArray(10,40));
		 QuickSort.sort(randomArray(6,30));
	}
	
	/*
	*	This method takes two integers size and n, 
	*	and returns an array of random integers from -n to n
	*   inclusive. 
	*/
	public static int[] randomArray(int size, int n)
	{
		int[] arr = new int[size];
		int min = -n;
		int max = n;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = min + (int)(Math.random() * ((max-min) +1 ));
		}
		
		return arr;
	}

}
