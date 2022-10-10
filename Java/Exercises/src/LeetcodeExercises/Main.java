package LeetcodeExercises;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(getGreatestCommonDivisor(a, b));
            System.exit(0);
        }
    public static int getGreatestCommonDivisor(int a,int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if (big % small == 0) {
            return small;
        }
        for (int i = small / 2; i > 1; i--) {
            if (big % i == 0 && small % i == 0) {
                return i;
            }
        }
        return 1;
    }



}
