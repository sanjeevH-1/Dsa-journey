class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n=word1.length();
        int m=word2.length();
        int i;
        for(i=0; i<n && i<m ;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));

        }

        if(n<m){
            sb.append(word2.substring(i));
        }

        else{
            sb.append(word1.substring(i));
        }
        return sb.toString();  // ✅ No comma after the statement
    }
    

}