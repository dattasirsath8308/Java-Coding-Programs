// package Pattern Programming Questions;


/* 
Q :  No = 5
Answer : 

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

 */


public class _1_starPattern {
    
    public static void main(String[] args) {
        

        int No = 5 ;

        for (int i = 0; i < No; i++) {
            for (int j = 0; j < No; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
