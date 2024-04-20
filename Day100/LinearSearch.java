import java.sql.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,9,1,18,9,20,35,15,9,9};
        int target = 9;
//        System.out.println(search(arr,target,0));
//        System.out.println(findindex(arr,target,0));
//         ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(findAllIndex(arr,9,0,list));
//        System.out.println(list);

        System.out.println(findAllIndexes(arr,target,0));
    }
    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }
    static int findindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findindex(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> ls){
        if (index == arr.length) {
            return ls;
        }
        if (arr[index] == target) {
            ls.add(index);
        }
        return findAllIndex(arr, target, index + 1,ls);
    }

    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index){
        ArrayList<Integer> ls = new ArrayList<>();
        if(index == arr.length) return ls;

        if(arr[index] == target){
            ls.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndexes(arr,target,index+1);
        ls.addAll(ansFromBelowCalls);

        return ls;
    }
}
