import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.nextLine();
            //Complete the code
            System.out.println(check(input));
		}
		
	}
    public static boolean check(String input){
        Stack<Character> stack=new Stack<>();
        for(char s:input.toCharArray() ){
            if(s=='{'){
                stack.push('}');
            }
            else if(s=='('){
                stack.push(')');
            }
            else if(s=='['){
                stack.push(']');
            }
            else if(stack.isEmpty()||s!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
