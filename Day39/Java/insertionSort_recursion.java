public class insertionSort_recursion {
    static void insertionSort(int arr[], int n) {
        if (n <= 1)
            return;
        insertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        insertionSort(arr, arr.length);
        System.out.println("Sorted array : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
