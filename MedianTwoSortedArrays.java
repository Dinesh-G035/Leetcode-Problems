class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int ind=0;
        for(int i=0;i<nums1.length;i++){
            arr[ind++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[ind++]=nums2[i];
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            double sum=arr[arr.length/2]+arr[(arr.length/2)-1];
            return (double)(sum/2);
        }
        return (double)arr[arr.length/2];
    }
}
