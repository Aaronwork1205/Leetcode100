class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
            } else if (s.charAt(i) == '{') {
                stack.add('{');
            } else if (s.charAt(i) == '[') {
                stack.add('[');
            }

            if (s.charAt(i) == ')') {
                if (stack.size() == 0) {
                    return false;
                } 
                char c = stack.pop();
                if (c != '(') {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                 if (stack.size() == 0) {
                    return false;
                } 
                char c = stack.pop();
                if (c != '[') {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                 if (stack.size() == 0) {
                    return false;
                } 
                char c = stack.pop();
                if (c != '{') {
                    return false;
                }
            }

        }
        return stack.size() == 0;
    }
}
