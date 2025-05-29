// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//insert at 2 second pos

class Main {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int tar=6;
        int pos=3;
        int size=arr.length;
        size++;
        int swap;
        for(int i= arr.length-1; i!=0;i--){
            arr[i]=arr[i-1];
            if(i==pos){
                arr[i]=tar;
                break;
            }
            
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
            
        }
        
        
       
}
}
