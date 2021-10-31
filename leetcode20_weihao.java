import java.util.Stack;
public class leetcode20_weihao {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == '[') {
                stack.push('[');
            } else if (s.charAt(i) == '{') {
                stack.push('{');
            }
            if (s.charAt(i) == ')') {
                if (stack.empty() || stack.pop() != '(') {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.empty() || stack.pop() != '[') {
                    return false;
                }
            } else if (s.charAt(i) == '}') {

                if (stack.empty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;

    }
}