class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
            char st=s.charAt(i);
            if((st=='(' )|| (st=='{') ||(st=='['))
            {
                stack.push(st);
                continue;
            }
            if(stack.isEmpty())
                 return false;
            char ch;
            switch(st){
                case ')':
                    ch=stack.pop();
                    if(ch=='{' || ch=='[')
                        return false;
                    break;  
                case '}':
                    ch=stack.pop();
                    if(ch=='('||ch=='[')
                         return false;
                    break;
                case ']':
                    ch=stack.pop();
                    if(ch=='(' ||ch=='{')
                        return false;
                    break;              
            }  
        }
        return stack.isEmpty();     
    }
    
}
