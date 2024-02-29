public class flipping_an_Image {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr1:image){
            reverse(arr1);
        } 
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0) image[i][j]=1;
                else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(arr);
        for(int[] a:ans){
            for(int no:a){
                System.out.print(no+" ");
            }
            System.out.println();
        }
    }
}
