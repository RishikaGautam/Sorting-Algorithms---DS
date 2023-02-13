import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] nums){
	
		// use the private helper methods here.
		quickSort(nums, 0, nums.length-1);
		System.out.println("sorted " + Arrays.toString(nums));
		
		
	}
	
	/*
	*
	* This private helper method takes a single array, an inclusive low, and an inclusive
	* high. The result is a sorted version of the original array performed
	* in place.
	*
	*/
	
	private static void quickSort(int[] nums, int low, int high)
	{
		System.out.println("sorting " + Arrays.toString(nums));
		//base case
	
		
		//partition nums
		if(low < high) {
			int pos = partition(nums, low, high);
			
			//quick sort right
			quickSort(nums, low, pos-1);
			//quick sort left
			quickSort(nums,pos+1, high);
		}
		
	
		
		
	
	}
	
	/* 
	*
	* This method takes a single array, an inclusive low, and an inclusive high.
	* It returns the index of the pivot in the array.
	*
	*/
	private static int partition(int[] nums, int low, int high)
	{
		//choose pivot (last element)
		int pivot = nums[high];
		
		int rightPos = low-1;
		//smaller than pivot on left, larger than pivot on right
		for(int i = low; i <= high-1; i++) {
			if(nums[i] < pivot) {
				rightPos++;
				int temp = nums[rightPos];
				nums[rightPos] = nums[i];
				nums[i] = temp;
				
			}
		}
		
		//place the pivot in correct spot
		int temp = nums[rightPos+1];
		nums[rightPos+1] = nums[high];
		nums[high] = temp;
		
		
	
		//return index of pivot
		return (rightPos+1);
	}
}

