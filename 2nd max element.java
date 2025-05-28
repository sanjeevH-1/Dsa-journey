// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1, 1, 1, 1};
        Arrays.sort(arr);
        int flag=0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] == arr[i+1] ){
                flag=1;
            }
        }
        if ( flag==1) {
            System.out.println("-1");
        } else {
            System.out.println(arr[arr.length - 2]);
        }
    }
}
