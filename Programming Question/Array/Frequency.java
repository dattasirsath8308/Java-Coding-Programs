import java.util.Scanner;

public class Frequency {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int n = sc. nextInt();

        int[] Arr = new int[n];


        System.out.println("Enter the "+n+" Element :");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] =sc.nextInt();
        }

        int[] freq = makeFreqArray(Arr);

        System.out.println("Enter the No of Queries :");
        int q = sc.nextInt();

        while(q > 0)
        {
            System.out.println("Enter the to be searched..");
            int x = sc.nextInt();

            if(freq[x] > 0)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");

            }
            q--;
        }


    }



    public static  int [] makeFreqArray(int[] Arr)
    {   
        int [] freq = new int[100005];

        for (int i = 0; i < Arr.length; i++) {
                freq[Arr[i]]++;
        }

        return freq;
    }


}
