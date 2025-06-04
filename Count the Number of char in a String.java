// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str= "sanjeev";
        str=str.toLowerCase();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' &&  str.charAt(i)<='z'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}