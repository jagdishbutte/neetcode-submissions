class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens) {
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                int i = Integer.parseInt(s);
                st.push(i);
            } else if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b + a);
            } else if(s.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b - a);
            } else if(s.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(b * a);
            } else if(s.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
            }
        }
        return st.pop();
    }
}
