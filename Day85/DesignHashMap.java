package Day85;

import java.util.Arrays;

public class DesignHashMap {
    int a[];

    public  DesignHashMap() {
        a = new int[1000001];
        Arrays.fill(a,-1);
    }
    
    public void put(int key, int value) {
        a[key] = value;
    }
    
    public int get(int key) {
        return a[key];
    }
    
    public void remove(int key) {
        a[key] = -1;
    }
    public static void main(String[] args) {
        DesignHashMap obj = new DesignHashMap();
        obj.put(1,1);
        obj.put(2,2);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        obj.put(2,1);
        System.out.println(obj.get(2));
        obj.remove(2);
        System.out.println(obj.get(2));
    }
}
