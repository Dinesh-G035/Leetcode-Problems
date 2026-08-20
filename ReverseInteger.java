import java.util.*;
class ReverseInteger {
    public int reverse(int x) {
        int temp = x;
        long res = 0;

        while (temp != 0) {
            int d = temp % 10;
            res = res * 10 + d;
            temp /= 10;
        }

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) res;
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.reverse(x);

        System.out.println("Reversed number: " + result);

        sc.close();
    }
}
