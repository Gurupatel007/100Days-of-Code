public class MergeSort {
    static void merge(int[] arr,int low,int mid ,int high){
		int[] temp = new int[high-low+1];
		int count=0;
		int left = low;
		int right = mid+1;

		while(left<=mid && right<=high){
			if(arr[left]<=arr[right]){
				temp[count] = arr[left];
				left++;
				count++;
			}
			else{
				temp[count] = arr[right];
				right++;
				count++;
			}
		}
		while(left<=mid){
			temp[count] = arr[left];
			left++;
			count++;
		}
		while(right<=high){
			temp[count] = arr[right];
			right++;
			count++;
		}
		for(count=0, left=low;count<temp.length;count++,left++){
			arr[left]=temp[count];
		}
	}
	static void MS(int[] arr,int low,int high){
		if(low>=high)return;
		int mid = (low+high)/2;
		MS(arr,low,mid);
		MS(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	public static void mergeSort(int[] arr, int n) {
		MS(arr,0,n-1);
	}
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}