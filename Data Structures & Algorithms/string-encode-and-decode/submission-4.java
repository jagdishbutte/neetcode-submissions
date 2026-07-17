class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        
        if(strs.isEmpty()) {
        	return "";
        }
        
        for(String str : strs) {
        	encoded.append(str.length()).append(",");
        }
        
        encoded.append("#");
        
        for(String str : strs) {
        	encoded.append(str);
        }
        
        System.out.println(encoded);
        
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        
        if(str.length() == 0) {
        	return decoded;
        }
        
        List<Integer> sizes = new ArrayList<>();
        
        int i = 0;
        while(str.charAt(i) != '#') {
        	StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }

        	sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        
        for(int sz : sizes) {
        	decoded.add(str.substring(i, i + sz));
        	i += sz;
        }
  
        return decoded;
    }
}
