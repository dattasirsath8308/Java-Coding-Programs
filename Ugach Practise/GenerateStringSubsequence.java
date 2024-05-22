import java.util.ArrayList;

public class GenerateStringSubsequence {

    public static void main(String[] args) {
        
        String input = "abc";
        // printSubSequence(input,"");

        ArrayList<String>  subseq = countSubSequence(input,  "");
        System.out.println(subseq.size());
        printSubSequence(input, " ");

    }
    

    public static ArrayList<String>  countSubSequence(String input, String unprocessed)
    {

        // base case
        if(input.isEmpty())
        {
            ArrayList<String> output = new ArrayList<>();
            output.add(unprocessed);
            return output;
        }


        // main body
        // LHS
        ArrayList<String> lhs =  countSubSequence(input.substring(1), input.charAt(0) + unprocessed);

        // RHS
        ArrayList<String> rhs = countSubSequence(input.substring(1), unprocessed);

        lhs.addAll(rhs);

        return lhs;
    }



    public static void printSubSequence(String input, String unprocessed)
    {

        // base case
        if(input.isEmpty())
        {
            System.out.println(unprocessed);
            return;
        }


        // main body
        // LHS
        printSubSequence(input.substring(1), input.charAt(0) + unprocessed);

        // RHS
        printSubSequence(input.substring(1), unprocessed);

    }

}
