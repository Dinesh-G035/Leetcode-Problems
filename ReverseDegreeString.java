class ReverseDegreeString {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int res=26-(s.charAt(i)-'a');
            int pos=i+1;
            sum+=(res*pos);
        }
        return sum;
    }
}
