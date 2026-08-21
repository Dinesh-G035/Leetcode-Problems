public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean neg = dividend > 0 ^ divisor > 0;
        int a = dividend > 0 ? -dividend : dividend;
        int b = divisor  > 0 ? -divisor  : divisor;
        long qu = 0;
        while(a <= b){
            int temp= b;
            long mul=1;
            while(temp>=(Integer.MIN_VALUE>>1) && a<=(temp+temp)){
                temp+=temp;
                mul+=mul;
            }
            a-=temp;
            qu+=mul;
        }
        long re = neg ? -qu : qu;
        if(re < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if( re > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)re;
    }
}
