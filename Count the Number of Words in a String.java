// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Count the Number of Words in a String
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str = "swamss is a good girl";
        String[] s = new String[9];
        s=str.split(" ");
        int i=0;
        for(String ss : s){
            System.out.println(ss + (++i));
        }
        
    }
}