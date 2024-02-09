package Day29.java;

import java.util.ArrayList;
import java.util.List;

public class print_N_Times {
    static void printvalues(int i,int x,List<String> str){
        if(x<i) return;
        else{
            str.add("Coding Ninjas");
            printvalues(i+1, x, str); 
        }
    }
    public static List<String> printNtimes(int n){
        List<String> str = new ArrayList<String>();
        printvalues(1, n, str);
        return str;
    }
    public static void main(String[] args) {
        List<String> str = printNtimes(5);
        for(String s:str){
            System.out.println(s);
        }
    }
}
