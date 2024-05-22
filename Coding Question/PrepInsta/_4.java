
/* \
Question 4 :Borrow Number
Problem Statement  :

You have two numbers number1 and number2, your job is to check the number of borrow operations needed for subtraction of number1 from number2. If the subtraction is not possible then return the string not possible.

Example :

754
658

Answer :
2

654
666

Answer :
Not possible


*/


import java.util.*;
public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No : ");
        int number1 = sc.nextInt();
        System.out.println("Enter 2nd No : ");

        int number2 = sc.nextInt();
        int count = 0;
        if (number1 < number2) {
            System.out.println("Not possible");
        } else {
            boolean flag = false;
            while (number1 != 0 && number2 != 0) {
                int temp1 = 0;
                int temp2 = number2 % 10;
                if (flag)
                    temp1 = number1 % 10 - 1;
                else
                    temp1 = number1 % 10;
                if (temp1 < temp2) {
                    count++;
                    flag = true;
                } else
                    flag = false;
                number1 = number1 / 10;
                number2 = number2 / 10;
            }
            System.out.println(count);
        }

    }

}
