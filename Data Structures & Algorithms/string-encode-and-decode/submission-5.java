class Solution {

    public String encode(List<String> strs) {
        // StringBuilder encoded = new StringBuilder();
        
        // if(strs.isEmpty()) {
        // 	return "";
        // }
        
        // for(String str : strs) {
        // 	encoded.append(str.length()).append(",");
        // }
        
        // encoded.append("#");
        
        // for(String str : strs) {
        // 	encoded.append(str);
        // }
        
        // System.out.println(encoded);
        
        // return encoded.toString();


        StringBuilder encoded = new StringBuilder();
        for(String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        // List<String> decoded = new ArrayList<>();
        
        // if(str.length() == 0) {
        // 	return decoded;
        // }
        
        // List<Integer> sizes = new ArrayList<>();
        
        // int i = 0;
        // while(str.charAt(i) != '#') {
        // 	StringBuilder cur = new StringBuilder();
        //     while(str.charAt(i) != ',') {
        //         cur.append(str.charAt(i));
        //         i++;
        //     }

        // 	sizes.add(Integer.parseInt(cur.toString()));
        //     i++;
        // }
        // i++;
        
        // for(int sz : sizes) {
        // 	decoded.add(str.substring(i, i + sz));
        // 	i += sz;
        // }
  
        // return decoded;

        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            // StringBuilder num = new StringBuilder();
            int j = i;
            while(str.charAt(j) != '#'){
                // num.append(str.charAt(i));
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            decoded.add(str.substring(i, j));
            i = j;
        }
        return decoded;
    }
}
