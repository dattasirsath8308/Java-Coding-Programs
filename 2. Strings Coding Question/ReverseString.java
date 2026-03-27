//  ctrl + 1 = assign new varible  shortcut


public class ReverseString {

    private static int length;

    public static void main(String[] args) {
        

        String s1 = "Nahi";
        String s2 = "Ram";

        System.out.println("Before Reverse : s1= "+s1 +" , s2 = "+s2);


        s1 = s1 + s2;
        int len = s1.length() - s2.length();

        s2 = s1.substring(0, len);
        s1 = s1.substring(s2.length());

        System.out.println("After Swap : s1= "+s1 +" , s2 = "+s2);
        
    }


}
