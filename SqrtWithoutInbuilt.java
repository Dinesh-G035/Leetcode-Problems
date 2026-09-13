class SqrtWithoutInbuilt {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int left=0,right=x/2;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid<x){
                left=(int)mid+1;
            }
            else{
                right=(int)mid-1;
            }
        }
        return right;
    }
}
