

public class ReverseStringAndNumber {
    
    public static void main(String[] args) {
        

        String str = "Datta";
        System.out.println("Reverse String :");
        ReverseString(str);


        System.out.println("Reverse Number :");
        int No = 12345;
        ReverseNumber(No);
    }



    public static void ReverseString(String str){
        //  Datta --> attad

        if(str.isEmpty())
        return;

        // System.out.println(str.charAt( str.length()-1));
        // ReverseString(str.substring(0,str.length()-1));

        // ReverseString(str.substring(1) + str.);
    }


    public static void ReverseNumber(int No)
    {
        if(No == 0)
        {
            return;
        }

        int lastDidit = No % 10 ;
        System.out.print(lastDidit);

        ReverseNumber(No / 10);

    }


}
