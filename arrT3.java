import java.util.Scanner;
public class arrT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Enter " + length + " numbers:");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
