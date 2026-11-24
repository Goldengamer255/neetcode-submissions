class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char [] sChars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } 
            
            
            
            
            
            else if (stack.isEmpty()) {
                return false;
                }
                else {
            if (s.charAt(i) == '}') {
                char c = stack.peek();
                if (c == '{') {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }

            if (s.charAt(i) == ')') {
                char c = stack.peek();
                if (c == '(') {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }

            if (s.charAt(i) == ']') {
                char c = stack.peek();
                if (c == '[') {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

// Initial thoughts
// We use a stack and push the brackets on it
// if the bracket is a closing bracket we peek into the stack and the opening bracket must match
// if it does we continue if it doesnt then we return false