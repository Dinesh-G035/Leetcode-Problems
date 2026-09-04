class SmallestStableIndex_I {
    public int firstStableIndex(int[] nums, int k) {
        int num=nums.length;
        int[] pre=new int[num];
        pre[0]=nums[0];
        for(int i=1;i<num;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }
        int[] suf=new int[num];
        suf[num-1]=nums[num-1];
        for(int i=num-2;i>=0;i--){
            suf[i]=Math.min(suf[i+1],nums[i]);
        }
        for(int i=0;i<num;i++){
            if((pre[i]-suf[i])<=k){
                return i;
            }
        }
        return -1;
    }
}
