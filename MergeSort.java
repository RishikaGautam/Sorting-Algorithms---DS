import java.util.Arrays; 

public class MergeSort {
	
	/*
	 * This method takes an array of integers and performs mergesort on the array.
	 *  
	 */
	public static void sort(int[] nums){
		System.out.println("sorting " + Arrays.toString(nums));
		int first = 0;
		int last = nums.length;
		if(last > 2) {
			int middle = ((last-first)/2);
			int[] left = splitArray(nums, first, middle);
			int[] right = splitArray(nums, middle, last);
			
			
			// mergeSort left
			sort(left);
			// mergeSort right
			sort(right);
			System.out.println("merging " + Arrays.toString(left) +  " and " + Arrays.toString(right));
			// merge left and right
			merge(left, right, nums);
			
		}
		System.out.println(Arrays.toString(nums));
	}
	
	/*
	*	This method takes two sorted arrays, left and right,
	*   and the original unsorted array. We want to consistently 
	*   sort in place.
	*/
	private static void merge(int[] left, int[] right, int[] nums){
		int index = 0;
		int leftIndex = 0;
		int rightIndex = 0;
		
		while((rightIndex < right.length) && (leftIndex < left.length)) {
			if(left[leftIndex] >= right[rightIndex]) {
				nums[index] = right[rightIndex];
				rightIndex++;
			}else {
				nums[index] = left[leftIndex];
				leftIndex++;
			}
			
			index++;
		}
		
		while(rightIndex > right.length) {
			nums[index] = right[rightIndex];
			rightIndex++;
			index++;
		}
		
		while(leftIndex > left.length) {
			nums[index] = left[leftIndex];
			leftIndex++;
			index++;
		}
		
		
	}
	
	/*
	*	This method takes a single array, and an inclusive start
	*	and exclusive stop index. It returns the correct portion
	*	of the original array. 
	*/
	private static int[] splitArray(int[] nums, int start, int stop)
	{
		int[] arr = new int[stop-start];
		int index = start;
		for(int i = 0; (i < arr.length) && (index < stop); i++) {
			arr[i] = nums[index];
			index++;
		}
		
		return arr;

	}
}
