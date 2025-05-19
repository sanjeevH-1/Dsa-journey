// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Check if an Array is Sorted Forward, Backward or Not at All
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {5,4,3,2,1,2};
        int aflag=0,dflag=0,nlag=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                aflag=1;
                break;
        }
    }
       for(int i=0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
            dflag=1;
            break;
        } 
    }
    
    System.out.println(aflag+":"+dflag+":"+(aflag==dflag?"not sorted" : "sorted"));
}
}