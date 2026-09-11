class Unique3DigitEvenNumbers {
    public int totalNumbers(int[] digits) {
        int freq[] =new int[10];
        for(int i:digits){
            freq[i]++;
        }
        int count=0;
        for(int i=100;i<=998;i+=2){
            int[] u=new int[10];
            u[i/100]++;
            u[(i/10)%10]++;
            u[i%10]++;
            boolean valid=true;
            for(int d=0;d<=9;d++){
                if(u[d]>freq[d]){
                    valid=false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}
