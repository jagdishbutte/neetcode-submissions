class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // char[] sarr = s.toCharArray();
        // char[] tarr = t.toCharArray();
        // Arrays.sort(sarr);
        // Arrays.sort(tarr);
        // return Arrays.equals(sarr, tarr);

        // HashMap<Character, Integer> Count1 = new HashMap<>();
        // HashMap<Character, Integer> Count2 = new HashMap<>();
        // for(int i = 0; i < s.length(); i++) {
        //     Count1.put(s.charAt(i), Count1.getOrDefault(s.charAt(i), 0) + 1);
        //     Count2.put(t.charAt(i), Count2.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // return Count1.equals(Count2);

        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int val : count) {
            if(val != 0) return false;
        }

        return true;
    }
}
