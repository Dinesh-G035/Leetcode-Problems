class CountCommasRangeII {
    public long countCommas(long n) {
        long total=0;
        for(int i=4;i<=16;i++){
            long com=(i-1)/3;
            long low=(long)Math.pow(10,i-1);
            long high=(long)Math.pow(10,i)-1;

            if(low>n){
                break;
            }

            long count=Math.min(n,high)-low+1;
            total+=count*com;
        }
        return total;
    }
}
