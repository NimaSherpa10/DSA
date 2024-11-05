public class BubbleSort {

    public static void main(String[] args) {
        //Unsorted array
        int arr[] = {8,6,9,2,4,5};
        int temp = 0;

        //printing unsorted array
        System.out.println("Before sorting : ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
         bubbleSort(arr);
        System.out.println();
        System.out.println("After sorting : ");
        for(int num : arr) {
            System.out.print(num + " ");
        }



    }
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - i - 1;j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
