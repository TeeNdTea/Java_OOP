import java.util.Scanner;
public class arrT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int[] num = new int[N];
        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        int[] tempArr = new int[N];
        int index = 0;
        tempArr[index++] = num[0];

        for (int i = 1; i < N; i++) {
            if (num[i] != num[i - 1]) {
                tempArr[index++] = num[i];
            }
        }
        int remElmnt = N - index;
        System.out.print("New Array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();
        System.out.println("Removed elements: " + remElmnt);
    }
}
