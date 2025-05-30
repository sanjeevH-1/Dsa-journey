class Main {
    public static void main(String[] args) {
        
        String str = "sanjeev%%$34";
        int l=0,n=0,s=0;
        str=str.toLowerCase();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=123 )
            {
                l++;
            }
            else if(str.charAt(i)>=48 && str.charAt(i)<=58){
                n++;
            }
            else{
                s++;
            }
            
        }
        System.out.println(s+" "+l+" "+n);
        
    }
}