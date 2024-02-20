import java.util.List;
import java.util.*;

public class QuickSort {
    static int partition1(List<Integer> arr,int low,int high){
            int pivot = arr.get(low);
            int i = low;
            int j = high;

            while (i < j) {
                while (arr.get(i) <= pivot && i <= high - 1) {
                    i++;
                }
                while (arr.get(j) > pivot && j >= low + 1) {
                    j--;
                }
                if (i < j) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
            int temp = arr.get(low);
            arr.set(low, arr.get(j));
            arr.set(j, temp);
            return j;
    }

    static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i= low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    static void QuickSort1(List<Integer> arr,int low,int high){
        if (low < high) {
            int pivot = partition1(arr, low, high);
            QuickSort1(arr, low, pivot - 1);
            QuickSort1(arr, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = { 10, 7, 8, 9, 1, 5 };
        List<Integer> arr = Arrays.asList(10, 7, 8, 9, 1, 5);
        QuickSort1(arr, 0, arr.size() - 1);
        // for (int i : arr1) {
        //     System.out.print(i + " ");
        // }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}