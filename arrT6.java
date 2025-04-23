import java.util.Scanner;
public class arrT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        int[] num = new int[N];
        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (num[j] < num[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }
        double median;
        if (N % 2 == 0) {
            median = (num[N / 2 - 1] + num[N / 2]) / 2.0;
        } 
        else {
            median = num[N / 2];
        }
        System.out.println("The median is " + median);

    }
}
