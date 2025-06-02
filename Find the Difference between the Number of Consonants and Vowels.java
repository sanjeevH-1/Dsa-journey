// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str="sanjeev";
        int cnt=0;
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                cnt++;
            }
        }
        System.out.println(str.length()-cnt);
    }
}