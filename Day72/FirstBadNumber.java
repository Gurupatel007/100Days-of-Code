public class FirstBadNumber {
    /*
     * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
     * here as per the input the bad version is 4
     */
    public boolean isBadVersion(int version) {
        return version >= 4;
    }
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        // input n = 5, bad version = 4
        FirstBadNumber obj = new FirstBadNumber();
        System.out.println(obj.firstBadVersion(5));
    }
}
