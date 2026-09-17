class StringValidPalindrome {
    public boolean isPalindrome(String st) {
        StringBuilder s=new StringBuilder();
        for(char ch:st.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                s.append(Character.toLowerCase(ch));
            }
        }
        String str=s.toString();
        String res=new StringBuilder(str).reverse().toString();
        return str.equals(res);
    }
}
