class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];

            if (t.equals("+")) {
                int i1 = stack.pop();
                int i2 = stack.pop();
                stack.push(i1+i2);
            } else if (t.equals("-")) {
                int i1 = stack.pop();
                int i2 = stack.pop();
                stack.push(i2-i1);
            } else if (t.equals("*")) {
                int i1 = stack.pop();
                int i2 = stack.pop();
                stack.push(i1*i2);
            } else if (t.equals("/")) {
                int i1 = stack.pop();
                int i2 = stack.pop();
                stack.push(i2/i1);
            } else {
                stack.push(Integer.parseInt(t));
            }
        
        
        }
        return stack.pop();
        
    }
}
