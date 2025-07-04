
class Solution {

    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        char[] ch = new char[s.length()];
        ch = s.toCharArray();
        for (char c : ch) {
            if (Character.isLetterOrDigit(c)) {
                str.append(c);
            }
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;

        // String str= s.replace(" ","");
        // str=str.replace("?","");
        // str=str.replace("!","");
        // str=str.replace(",","");
        // str=str.replace("'","");
        // str=str.replace(".","");
        // str=str.replace(":","");
        // str=str.toLowerCase();
        // int low=0,high=str.length()-1;
        // int cnt=0;
        // while(low<high){
        //     if(str.charAt(low++) != str.charAt(high--)){
        //         cnt=1;
        //         break;
        //     }
        // }
        // if(cnt==0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}
