


public class RevString {

    public static void main(String[] args) {
        

        String str = " data BHau";
        System.out.println(str);

        String rev = revString(str);
        System.out.println("rev Is :"+rev);




    }

    public static String revString(String str)
    {
        if(str.isEmpty())
            return str;

         
            System.out.println("str.substring(1) "+str.substring(1));
            System.out.println("str.charAt(0) "+str.charAt(0));


            return revString(str.substring(1))+ str.charAt(0);

    }

}
