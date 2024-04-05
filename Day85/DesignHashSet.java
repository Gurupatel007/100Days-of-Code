package Day85;

/**
 * DesignHashSet
 */
public class DesignHashSet {

    private boolean[] hashSet;

    /** Initialize your data structure here. */
    public DesignHashSet() {
        hashSet = new boolean[1000001];
    }
    
    public void add(int key) {
        hashSet[key] = true;
    }
    
    public void remove(int key) {
        hashSet[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hashSet[key];
    }

    public static void main(String[] args) {
        DesignHashSet obj = new DesignHashSet();
        obj.add(1);
        obj.add(2);
        System.out.println(obj.contains(1));
        System.out.println(obj.contains(3));
        obj.add(2);
        System.out.println(obj.contains(2));
        obj.remove(2);
        System.out.println(obj.contains(2));
    }
}