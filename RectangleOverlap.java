class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2]<=rec2[0] || rec2[2]<=rec1[0] || rec1[3]<=rec2[1] || rec2[3]<=rec1[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rec1 = new int[4];
        int[] rec2 = new int[4];
        for (int i = 0; i < 4; i++) {
            rec1[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            rec2[i] = sc.nextInt();
        }
        System.out.println(isRectangleOverlap(rec1, rec2));
        sc.close();
    }
}
