
/*

Question 9 : Guess the word
Problem Statement : 
Kochouseph Chittilappilly went to Dhruv Zplanet , a gaming space, with his friends and played a game called “Guess the Word”.
Rules of games are –
Computer displays some strings on the screen and the player should pick one string / word if this word matches with the random word that the computer picks then the player is declared as Winner.
Kochouseph Chittilappilly’s friends played the game and no one won the game. This is Kochouseph Chittilappilly’s turn to play and he decided to must win the game.
What he observed from his friend’s game is that the computer is picking up the string whose length is odd and also that should be maximum. Due to system failure computers sometimes cannot generate odd length words. In such cases you will lose the game anyways and it displays “better luck next time”. He needs your help. Check below cases for better understand

Sample input 0:
5 → number of strings
Hello Good morning Welcome you
Sample output 0:
morning

Explanation:

Hello → 5
Good → 4
Morning → 7
Welcome → 7
You → 3
First word that is picked by computer is morning

Sample input 1:
3
Go to hell
Sample output 1:
Better luck next time
Explanation: 
Here no word with odd length so computer confuses and gives better luck next time

*/

import java.util.*;

public class _9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();

        int len = 0;
        ArrayList<String> oddLength = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            len = arr[i].length();
            if (len % 2 == 1)
                oddLength.add(arr[i]);
        }
        if (oddLength.size() == 0)
            System.out.println("Better luck next time");
        else {
            Iterator itr = oddLength.iterator();
            int max = -1;
            String res = "";
            while (itr.hasNext()) {
                String temp = (String) itr.next();
                if (temp.length() > max) {
                    res = temp;
                    max = temp.length();
                }
            }
            System.out.println(res);
        }
    }
}
