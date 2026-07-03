class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder str = new StringBuilder();
        // for(int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if(Character.isLetterOrDigit(ch)) {
        //         str.append(Character.toLowerCase(ch));
        //     }
        // }
        // String original = str.toString();
        // String reverse = str.reverse().toString();
        // return original.equals(reverse);

        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if(!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
