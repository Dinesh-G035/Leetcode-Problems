class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=1;j<i;j++){
                List<Integer> prev=list.get(i-1);
                l.add(prev.get(j-1)+prev.get(j));
            }
            if(i>0){
                l.add(1);
            }
            list.add(l);
        }
        return list;
    }
}
