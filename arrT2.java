import java.util.Scanner;
public class arrT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        int sm = num[0];
        int lar = num[0];
        int smLoc = 0;
        int larLoc = 0;

        for (int i = 1; i < 5; i++) {
            if (num[i] < sm) {
                sm = num[i];
                smLoc = i;
            }
            if (num[i] > lar) {
                lar = num[i];
                larLoc = i;
            }
        }
        System.out.println("The largest number " + lar + " was found at location " + larLoc + ".");
        System.out.println("The smallest number " + sm + " was found at location " + smLoc + ".");
    }
}
