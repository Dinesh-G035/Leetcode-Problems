class DistinctSubsequencesII {
    public int distinctSubseqII(String s) {
        final int MOD=1000000007;
        long[] arr=new long[26];
        long total=0;
        for(char ch:s.toCharArray()){
            int val=ch-'a';
            long prev=arr[val];
            arr[val]=(total+1)%MOD;
            total=(total+arr[val]-prev+MOD)%MOD;
        }
        return (int)total;
    }
}
