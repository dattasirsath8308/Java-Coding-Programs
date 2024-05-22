


public class RemoveAdjacentDuplicate {

    public static void main(String[] args) {
        
        String str = "aaaabbbcaabb";

        removeAdjacentDuplicate(str);

    }

    static void removeAdjacentDuplicate(String str)
    {
        // base case [ print last index]
        if(str.length() == 1)
        {
            System.out.print(str);
            return;
        }

        //  main body
        if(str.charAt(0) != str.charAt(1))
        {
            System.out.print(str.charAt(0));
        }

        //  traverse
        removeAdjacentDuplicate(str.substring(1));
    }
    
}
