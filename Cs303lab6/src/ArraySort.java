


public class ArraySort {
	
	public static void sort(int[]arr, int small, int big, int maxval, int minval){
		
			 Sortit ( arr, small, big, maxval, minval);
	
	}
	public static void swap(int[] arr, int i, int j) {
		 int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		
	}
	public static void Sortit(int[] arr, int small, int big, int maxval, int minval) {
		

		for(int i = 0; i <= arr.length -1; i++){
			
			for(int j = i+1; j < arr.length; j++){
		
				if(arr[j] < arr[minval]){
					minval = j;
					

				}
				
				
				if(arr[i] >= maxval){
					maxval = arr[i];
					maxval =i;
					
				}
				//swap(arr, maxval, j);
			}
			swap(arr, minval, i);
			swap(arr, maxval, i);
		}
	}
}

