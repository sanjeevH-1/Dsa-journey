// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1,2,4,5,3};
        int tar=4,flag=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==tar)
                {   
                    flag=1;
                    System.out.println("true");
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("false");
        }
        
        
        
    }
}