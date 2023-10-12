package Sort;

import java.util.Arrays;

public class selection {
	public static void main(String[] args) {
		// selection sort
		int[] arr = {35, 5, 47, 13, 27};
		System.out.println("정렬 전: " + Arrays.toString(arr));
		
		selectionSort(arr);
		
		System.out.println("정렬 후: " + Arrays.toString(arr));
	}
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println("정렬 전: " + Arrays.toString(arr));
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println("정렬 후: " + Arrays.toString(arr));
        }
    }
    
}

