import java.util.Scanner;
public class arrT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int[] num = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        int[] occr = new int[N];
        for (int i = 0; i < N; i++) {
            if (occr[i] == 1) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < N; j++) {
                if (num[i] == num[j]) {
                    count++;
                    occr[j] = 1;
                }
            }
            System.out.println(num[i] + " - " + count + " times");
        }
    }
}
