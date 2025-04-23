import java.util.Scanner;
public class arrT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int N = sc.nextInt();
        int[] inArr = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            inArr[i] = sc.nextInt();
        }
        System.out.print("Remove Element= ");
        int remEl = sc.nextInt();
        System.out.println("Input array:");
        for (int i = 0; i < N; i++) {
            System.out.print(inArr[i] + " ");
        }
        System.out.println();
        int[] newArr = new int[N];
        int newIn = 0;

        for (int i = 0; i < N; i++) {
            if (inArr[i] != remEl) {
                newArr[newIn++] = inArr[i];
            }
        }
        if (newIn < N) {
            System.out.println("New array:");
            for (int i = 0; i < newIn; i++) {
                System.out.print(newArr[i] + " ");
            }
        } 
        else {
            System.out.println("Element not found");
        }
    }
}
