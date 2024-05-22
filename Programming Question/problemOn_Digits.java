import java.util.Scanner;

public class problemOn_Digits {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = sobj.nextInt();

        // 1. Count the number of digit for a given number n
        DigitCount(number);
        System.out.println();


        // 2. Find the sum of digit of given number n
        SumofDigit(number);
        System.out.println();

        // 3. Reverse the digit 123 -> 321
        ReverseDigit(number);
        System.out.println();

        // 4. find the sum of the series : S = 1 - 2 + 3 - 4 ...n
        sumofSeries(number);
        System.out.println();

        // 5. print the first n factorial number
        factorialofNumber(number);
        System.out.println();

        // 6. Given 2 number a and b. Find a raise to the power b . a=2 b=3 2*2*2 = 8
        powerOfNumber(number);
    }

    // 1
    public static void DigitCount(int No) {
        int number = No;
        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(" No is digit is " + count + " of the " + No);
    }

    // 2
    public static void SumofDigit(int No) {
        int number = No;
        int sum = 0, digit = 0;

        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(" Sum of digit are " + sum + " of the " + No);
    }

    // 3
    // 123 % 10 (rev= 0)
    // rev = (rev * 10) + 3 = 321
    // 123 / 10
    public static void ReverseDigit(int No) {
        int number = No;
        int rev = 0, digit = 0;

        while (number > 0) {
            // 123
            digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
        }
        System.out.println(" Reverse of digit are " + rev + " of the " + No);
    }

    // 4
    public static void sumofSeries(int No) {
        int number = No;
        int ans = 0;
        int i = 1;
        while (number >= i) {
            if (i % 2 == 0) {
                ans -= i;
            } else {
                ans += i;
            }

            i++;
        }

        System.out.println(" Sum of series  is " + ans);
    }

    // 5. factorial 3 = 3 * 2 * 1 = 6
    public static void factorialofNumber(int No) {
        int fact = 1;
       
        for (int j = 1; j <= No; j++) {
            fact *= j ;
            System.out.println("Factorial of " + j + " : "+ fact);
        }

    }

    /*
    // 6. power 2^3 = 2*2*2 = 8
    a =2 b = 3    : 2*2*2 = 8 
    ans = 1 ;  ans * a = 2 ,    loop = b(3)  

    */

    public static void powerOfNumber(int No) {
        int rest = 2;
        int sum = 1;

        // 2
        for (int j = 1; j <= rest; j++) {
            sum = sum * No;
        }
        System.out.println("No "+ No + " rest : "+rest + ": "+ sum);

    }

}
