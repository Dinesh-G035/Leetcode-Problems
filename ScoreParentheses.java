class ScoreParentheses {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(0);
            }
            else{
                int top=stack.pop();
                int score=(top==0)?1:2*top;
                int temp=stack.pop();
                stack.push(temp+score);
            }
        }
        return stack.pop();
    }
}
