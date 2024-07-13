import java.util.Stack;

public class ValidParentheses
{
    public static void main(String[] args) {

        String s = "[{()[]}()]}";
        boolean result = isParenthese(s);
        if(result)
            System.out.println("Parentheses " +s+ " are valid");
        else
            System.out.println("Parentheses " +s+ " are not valid");
    }

    public static boolean isParenthese(String s)
    {
        Stack<Character> stack = new Stack();

        for(Character c : s.toCharArray())
        {
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
