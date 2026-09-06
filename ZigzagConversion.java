class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()){
            return s;
        }
        StringBuilder[] str=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            str[i]=new StringBuilder();
        }
        int row=0,direction=-1;
        for(char ch:s.toCharArray()){
            str[row].append(ch);
            if(row==0 || row==numRows-1){
                direction=-direction;
            }
            row+=direction;
        }
        StringBuilder word=new StringBuilder();
        for(StringBuilder r:str){
            word.append(r);
        }
        return word.toString();
    }
}
