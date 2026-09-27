class AddDigits {
    public int addDigits(int n) {
        while(n>9){
            n=sumDigit(n);
        }
        return n;
    }
    private int sumDigit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
