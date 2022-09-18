class Solution {
    public boolean isValid(String str) {
          Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else if(ch==')' || ch=='}' || ch==']'){
                if(st.isEmpty()) return false;
                if(ch==')' && st.peek()!='(') return false;
                if(ch=='}' && st.peek()!='{') return false;
                if(ch==']' && st.peek()!='[') return false;
                st.pop();
            }
            
        }if(st.isEmpty()) return true;
        return false;
    }
}