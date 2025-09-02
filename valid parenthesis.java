
public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.isValid("([{}])"));   // Expect: true
        System.out.println(sol.isValid("abcd"));   // Expect: false
        System.out.println(sol.isValid("aabb"));   // Expect: false
        System.out.println(sol.isValid("ccddcc")); // Expect: true
    }
}

class Solution {

    public boolean isValid(String s) {
        if (s.length() % 2 == 0) {
            for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                if (!(s.charAt(i) == (s.charAt(j)))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
