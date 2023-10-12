package Sort;

public class bubble {

	public static void main(String[] args) {
		// bubble sort
        int[] arr = {52, 15, 34, 45, 21, 8, 77};

        System.out.println("정렬 전:");	
        printArray(arr);

        bubbleSort(arr);

        System.out.println("정렬 후:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {                
            	if (arr[j] > arr[j + 1]) {
                	System.out.println("전");
                	printArray(arr);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("후");
                    printArray(arr);
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

	}

}
