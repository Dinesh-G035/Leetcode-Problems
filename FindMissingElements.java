class FindMissingElements {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        List<Integer> list=new ArrrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
