import java.util.Scanner;

public class Number_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Binary No :  (Binary to Decimal Number)");
        int no1 = sc.nextInt();

        System.out.println("Enter the Decimal Number : (Decimal to Binary Number)");
        int no2 = sc.nextInt();

        System.out.println("Enter the Decimal Number : (Decimal to Octal Number)");
        int no3 = sc.nextInt();

        System.out.println("Enter the Octal Number : (Octal to Decimal Number)");
        int no4 = sc.nextInt();

        System.out.println("\n--------------------\n");

        // 1
        BinarytoDecimal(no1);

        // 2
        DecimaltoBinary(no2);

        // 3
        DecimaltoOctal(no3);

        // 4
        OctaltoDecimal(no4);

    }

    // 1
    public static void BinarytoDecimal(int no) {
        int fromNumberSystem = 2, ToNumberSystem = 10;
        int ans = 0;
        int pw = 1; // 2^0 = 1 OR 10^0 = 1

        while (no != 0) {

            int digit = no % ToNumberSystem;
            ans += (digit * pw);
            no /= ToNumberSystem;
            pw = pw * fromNumberSystem;
        }

        System.out.println("Binary to Decimal   : " + ans);

    }

    // 2 :
    public static void DecimaltoBinary(int no) {
        int fromNumberSystem = 10, ToNumberSystem = 2;
        int ans = 0;
        int pw = 1; // 2^0 = 1 OR 10^0 = 1

        while (no != 0) {

            int digit = no % ToNumberSystem;
            ans += (digit * pw);
            no /= ToNumberSystem;
            pw = pw * fromNumberSystem;
        }

        System.out.println("Decimal  to Binary : " + ans);

    }

    // 3
    public static void DecimaltoOctal(int no) {
        int fromNumberSystem = 10, ToNumberSystem = 8;
        int ans = 0;
        int pw = 1; // 2^0 = 1 OR 10^0 = 1

        while (no != 0) {

            int digit = no % ToNumberSystem;
            ans += (digit * pw);
            no /= ToNumberSystem;
            pw = pw * fromNumberSystem;
        }

        System.out.println("Decimal  to Octal : " + ans);

    }

    // 4
    public static void OctaltoDecimal(int no) {
        int fromNumberSystem = 8, ToNumberSystem = 10;
        int ans = 0;
        int pw = 1; // 2^0 = 1 OR 10^0 = 1

        while (no != 0) {

            int digit = no % ToNumberSystem;
            ans += (digit * pw);
            no /= ToNumberSystem;
            pw = pw * fromNumberSystem;
        }

        System.out.println("Octal to Decimal   : " + ans);

    }


     public void BtoD(int no)
     {
         int fromBinary = 2 , toDecimal = 10 ;
         int ans = 0 ;
         int pw = 1;


         while(no != 0)
         {
            int digit =  no % toDecimal ;
            ans += (pw * digit);
            no = no / toDecimal ;
            pw = pw *  fromBinary;

            




         }



     }



}

/*
 * 
 * public static void BinarytoDecimal(int no)
 * {
 * int number_system = 2 ;
 * int ans = 0 ;
 * int pw = 1; // 2^0 = 1 OR 10^0 = 1
 * 
 * 
 * 
 * while(no != 0)
 * {
 * 
 * // digit = 1001 % 10 = 1 , 0 , 0 , 1
 * int digit = no % 10 ;
 * // ans += (1 * 1) = 1 , 0 + 0 + 8 : ans = 9
 * ans += (digit * pw ) ;
 * 
 * // 1001 / 10 = 100 , 10 , 1
 * no /= 10;
 * 
 * //pw 1 * 2 = 2 , 2 * 2 = 4 , 4 *2 = 8
 * pw = pw * number_system;
 * }
 * 
 * System.out.println("Bianry to Decimal : "+ans);
 * 
 * }
 * 
 * public static void DecimaltoBinary(int no2)
 * {
 * int number_system = 10 ;
 * int ans = 0 ;
 * int pw = 1; // 2^0 = 1 OR 10^0 = 1
 * 
 * 
 * 
 * while(no2 != 0)
 * {
 * 
 * // digit = 1001 % 10 = 1 , 0 , 0 , 1
 * int parity = no2 % 2 ;
 * // ans += (1 * 1) = 1 , 0 + 0 + 8 : ans = 9
 * ans += (parity * pw ) ;
 * 
 * // 1001 / 10 = 100 , 10 , 1
 * no2 /= 2;
 * 
 * //pw 1 * 2 = 2 , 2 * 2 = 4 , 4 *2 = 8
 * pw = pw * number_system;
 * }
 * 
 * System.out.println("Decimal  to Binary : "+ans);
 * 
 * }
 * 
 */
