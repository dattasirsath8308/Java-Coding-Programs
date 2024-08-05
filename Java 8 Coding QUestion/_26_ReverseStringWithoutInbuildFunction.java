import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _26_ReverseStringWithoutInbuildFunction {

    public static void main(String[] args) {

        reverse1();

        reverse2();

        reverse3();

        reverse4();

        reverse5UsingJava8();

    }

    public static void reverse1() {
        String str = "datta";
        String rev = "";
        StringBuffer sb = new StringBuffer();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        rev = sb.toString();
        System.out.println(rev);

    }

    public static void reverse2() {
        String str = "Hello";
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
    }

    public static void reverse3() {
        String str = "Mera";
        char[] ch = str.toCharArray();
        String rev = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        System.out.println(rev);
    }

    public static void reverse4()
    {
        String str = "ye  Ikde Lawadya";

        char []ch = str.toCharArray();
        int start = 0;
        int end = ch.length -1 ;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        String rev = new String(ch);
        System.out.println(rev);
    }


    public static void reverse5UsingJava8()
    {
        String str = "Chala hawa yeudya";
        
        String rev = Stream.of(str)
        .map(s -> new StringBuilder(s).reverse())
        .collect(Collectors.joining());

        System.out.println(rev);

    }

}
