class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pat = strs[0];
        int cnt=0;
        
        while(cnt<=strs.length){
            cnt=0;
            for(int i=0;i<strs.length;i++){
                if(strs[i].startsWith(pat)){
                    cnt++;
                }
                else if(strs[i].equals("")){
                    return "";
                }
                else{
                    int l=pat.length();
                    pat=pat.substring(0,l-1);
                    cnt--;
                }
                if(cnt==strs.length){
                    return pat;
                }
            }
        }
        return "";
    }
}