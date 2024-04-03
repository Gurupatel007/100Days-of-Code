import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public int[] intersection(int[] array1, int[] array2) {
        //first sort the both arrays.
        Arrays.sort(array1);
        Arrays.sort(array2);
        List<Integer> resultList = new ArrayList<>();
        
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                if(resultList.isEmpty() || resultList.get(resultList.size()-1)!=array1[i]){
                    // When both are equal and not repeated
                    resultList.add(array1[i]);
                }
                i++;
                j++;
            }
        }

        // Convert List to array
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }
        
        return result;
    }
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};
        int[] result = intersection.intersection(array1, array2);
        System.out.println(Arrays.toString(result));
    }
}
