//Task 1
public class Task1a{
  public static void main(String[]args){
    int i = 2;
    while(i<=50){
      if(i!=50){
        System.out.print(i+", ");
      }
      else{
        System.out.print(i);
      }
      i+=4;
    }
  }
}

public class Task1b {
    public static void main(String[] args) {
        int p = 1; 
        int diff = 2; 
        int count = 1; 
        while (count <= 15) {
            System.out.print(p + " ");
            p += diff;
            diff++;  
            count++; 
        }
    }
}


//Task2
public class Task2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        for (int i = 18; i >= 2; i -= 2) {
            System.out.print(i + " ");
        }
    }
}


//Task3
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int min = 0;
        int max = 0;
        System.out.println("Enter 10 numbers:");

        while (count < 10) {
            int num = sc.nextInt();
            sum += num;
            
            if (count == 0) {
                min = num;
                max = num;
            } 
            else {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
            
            count++;
        }
        
        double average = (double) sum / 10;
        System.out.println("Sum = " + sum);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + average);
    }
}


//Task4
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int min = 0;
        int max = 0;
        int pos = 0;
        System.out.println("Enter 10 numbers:");

        while (count < 10) {
            int num = sc.nextInt();
            
            if (num > 0 && num % 2 != 0) {
                if (pos == 0) {
                    min = num;
                    max = num;
                } 
                else {
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                }
                sum += num;
                pos++;
            }
            count++;
        }
        if (pos == 0) {
            System.out.println("No odd positive numbers found");
        } 
        else {
            double average = (double) sum / pos;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + average);
        }
    }
}


//Task5
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int min = 0; 
        int max = 0; 
        int zeroCount = 0;
        System.out.println("Enter numbers for three consecutive zeros to stop:");

        while (zeroCount < 3) {
            int num = sc.nextInt();
            if (num == 0) {
                zeroCount++;
            } 
            else {
                zeroCount = 0; 
                sum += num;
                count++;
                if (count == 1) {
                    min = num;
                    max = num;
                } 
                else {
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("No numbers found");
        } 
        else {
            double average = (double) sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + average);
        }
    }
}


//Task6
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumNum = 0;
        double sumWts = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter num " + i + " & ");
            System.out.println("Enter weight " + i + ": ");
            double num = sc.nextDouble();
            double weight = sc.nextDouble();
            sumNum += num * weight;
            sumWts += weight;
        }
        double weightAvg = sumNum / sumWts;
        System.out.println("Weighted Average = " + weightAvg);
    }
}


//Task7
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int input = sc.nextInt();
        int p = 1, q = 1;
        int next = p + q;
        int sum = p + q;
        System.out.print(p + " " + q);
        while (next <= input) {
            System.out.print(" " + next);
            sum += next;
            p = q;
            q = next;
            next = p + q;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}


//Task8
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();        
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int p, q;
        if (num1 < num2) {
            p = num1;
            q = num2;
        } 
        else {
            p = num2;
            q = num1;
        }
        int primeNo = 0;
        for (int i = p; i <= q; i++) {
            if (i > 1) { 
                int prime = 1; 
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        prime = 0; 
                        break;
                    }
                }
                if (prime == 1) {
                    primeNo++;
                }
            }
        }

        System.out.println("There are " + primeNo + " prime numbers between " + p + " and " + q + ".");
    }
}


//Task9
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;        
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println(count + " digits.");
        
        //b
        System.out.println();
        temp = num;
        int div = 1;
        for (int i = 1; i < count; i++) {
            div *= 10;
        }
        while (div > 0) {
            int digit = temp / div;
            System.out.print(digit * 7 + " ");
            temp %= div;
            div /= 10;
        }
    }
}


//Task10

import java.util.Scanner;
public class Task10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of money:");
        int amt = sc.nextInt();
        
        int count500 = 0, count100 = 0, count50 = 0, count10 = 0, count5 = 0, count1 = 0;
        
        while (amt > 0) {
            if (amt >= 500) {
                count500++;
                amt -= 500;
            } 
            else if (amt >= 100) {
                count100++;
                amt -= 100;
            } 
            else if (amt >= 50) {
                count50++;
                amt -= 50;
            } 
            else if (amt >= 10) {
                count10++;
                amt -= 10;
            } 
            else if (amt >= 5) {
                count5++;
                amt -= 5;
            } 
            else if (amt >= 1) {
                count1++;
                amt -= 1;
            }
        }
        
        if (count500 > 0) {
            System.out.println(count500 + " 500's note");
        }
        if (count100 > 0) {
            System.out.println(count100 + " 100's note");
        }
        if (count50 > 0) {
            System.out.println(count50 + " 50's note");
        }
        if (count10 > 0) {
            System.out.println(count10 + " 10's note");
        }
        if (count5 > 0) {
            System.out.println(count5 + " 5's note");
        }
        if (count1 > 0) {
            System.out.println(count1 + " 1's note");
        }
    }
}


//Task11
      //a
import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

     //b
import java.util.Scanner;
public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the triangle:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
