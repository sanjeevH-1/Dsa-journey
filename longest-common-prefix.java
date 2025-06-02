
class Solution {

    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        while (!"".equals(pre)) {
            int cnt = 0;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].startsWith(pre)) {
                    //char ch=pre.charAt((pre.length())-1);
                    //pre.replace(pre.charAt(pre.length()) , "" );
                    cnt++;

                } else {

                    pre = pre.substring(0, pre.length() - 1);
                }
            }
            if (cnt == strs.length) {
                return pre;

            }

        }

        return "";
    }
}
