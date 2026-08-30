class RemovingMinimumandMaximumFromArray {
    public int minimumDeletions(int[] nums) {
        int len=nums.length;
        int minId=0,maxId=0;
        for(int i=1;i<len;i++){
            if(nums[minId]>nums[i]){
                minId=i;
            }
            if(nums[maxId]<nums[i]){
                maxId=i;
            }
        }
        int left=Math.min(minId,maxId);
        int right=Math.max(minId,maxId);

        int front=right+1;
        int back=len-left;
        int both=(left+1)+(len-right);

        return Math.min(front,Math.min(back,both));
    }
}
