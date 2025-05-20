// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        TreeSet<Integer> set = new TreeSet<>();
        int[] arr = {7,6,7,5,4,5,3,4,6,2,1};
        for(int i : arr){
            set.add(i);
        }
        Integer[] a = set.toArray(new Integer[0]);
        
        for(int i=0;i<a.length;i++){
            int cnt=0;
            for(int j=0; j<arr.length ; j++){
                if(a[i] == arr[j]){
                    cnt++;
                }
            }
            System.out.println(a[i] +" occurred "+cnt+" times!");
        }
        System.out.println("unique:"+set.size());
    }
}