//  REMEMBER TO CHANGE THE CLASS NAME ACCORDINGLY


//task-1
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



//task-2
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



//task-3

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



//task-4
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


//task-5
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



//task-6
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
