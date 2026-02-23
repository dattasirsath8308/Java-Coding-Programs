
/* 
1.  Find the second highest number from a list
- 5, 9, 2, 11, 4, 11


2. Count occurrences of each word in a string
String input = "apple mango apple orange mango apple";


3. Remove duplicate elements from a list
    Arrays.asList(1,2,2,3,4,4,5);




4. Find first non-repeated character in a string
- aabbcddee


1. Check if pair with given Sum exists in Array
Example [1, 2, 7, 3, 6, -9, 11]
number = 9


2. Given a list of sentences, find the sentence with most number of words
S1: This is a sample sentence  -> Answer : Word Count: 5
S2: Another sentence -> Answer : Word Count: 2


*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class Practise2 {

    public static void main(String[] args) {

        
        // second Highest
        secondHighest();

        secondHighestWithoutStream();

        secondHighestWithoutStream2();


        // Count Occurance word & each character 

        countOccuranceEachWord();

        countOccuranceEachWordJava8();

        countOccuranceEachCharacterJava8();


        // Remove Duplicartes
        removeDuplicatesWithoutCollections();

        removeDuplicatesUsingCollections();

        removeDuplicatesUsingHashSet();

        removeDuplicatesUsingStream();

        // first non-repeated character
        firstNonRepeatingCharcter();


        // pair Sum 

        pairSumBruteForce();

        findAllPairsUsingSet();

        findAllPairsJava8();


        countNumberOfWordsfromSentence();



        // reverse String 

        		reverse1();
		
		reverse2();
		
		reverse3();
		
		reverse4();
		

        ReverseStringUsingStack(); 


        // swip 
		swip1();
		
		swip2();



    }



    public static void secondHighest(){


        List<Integer> list  = Arrays.asList(5, 9, 2, 11, 4, 11);


       long secondHighest = list.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElseThrow();

        System.out.println("second highest : "+ secondHighest);

    }
  
    

    public static void secondHighestWithoutStream(){


        int []Arr = {10,20,30,40,50,};
        
        int max = Arr[0];
        int second = Arr[0];
        

        int n = Arr.length;

        for(int i = 0 ; i < n; i++ ){

            if(max < Arr[i] ){
                second = max;
                max = Arr[i];
            }else if(Arr[i] != max &&  Arr[i] > second){
                second = Arr[i];
            }

        }

        System.out.println("Highest " + max +" , Second Highest "+ second);

    }



    public static void secondHighestWithoutStream2(){


        int []Arr = {10,20,30,40,50,};
        
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int value : Arr) {
            
            if(max < value){
                second = max;
                max = value;
            }else if(second < value && max != value){
                second = value;
            }

        }


        System.out.println(" 2nd Program :\n  Highest " + max +" , Second Highest "+ second);

    }


    public static void countOccuranceEachWord(){


        String input = "apple mango apple orange mango apple";


        // 1. Occurance of each character 
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : input.toCharArray()){

            if(ch != ' '){
               
                if(map.containsKey(ch))
                {
                    map.put(ch, map.get(ch)+ 1 );
                }else {
                    map.put(ch,1);
                }
            }
        }


        System.out.println(map);
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        

        // 2. Occurance of each word 

        HashMap<String, Integer> map2 = new HashMap<>();

        String []statement = input.split(" ");


        for(String word : statement){

            if(map2.containsKey(word)){
                map2.put(word, map2.get(word) + 1 );
            }else{
                map2.put(word,  1 );
            }

        }

        System.out.println(map2);

    }



    public static void countOccuranceEachWordJava8(){

        System.out.println("\nEach word  using Java 8 ");
        
        String input = "apple mango apple orange mango apple";

        Map<String, Long> map = Arrays.stream(input.split(" "))
        .collect(Collectors.groupingBy(word -> word , Collectors.counting()));

        System.out.println("using Java 8 for word occurance");
        map.forEach((k,v) -> System.out.println("Key :"+ k  + " value : "+ v));

    }



    public static void countOccuranceEachCharacterJava8(){

        System.out.println("\nEach character using Java 8 ");
        
        String input = "apple mango apple orange mango apple";

        
        Map<Character, Long> map = input.chars()
        .mapToObj(ch -> (char)ch)
        .filter(ch -> ch != ' ')
        .collect(Collectors.groupingBy(ch -> ch , Collectors.counting()));


        map.forEach((k,v) -> System.out.println(k +" : "+ v));

    }



        public static void removeDuplicatesWithoutCollections() {   

        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[j] = arr[i];
                j++;
            }
        }

        System.out.print("Unique values: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }




    public static void removeDuplicatesUsingCollections(){

        System.out.println("\nremove Duplicate using Collections ");

        // int[] arr = {1, 2, 2, 3, 4, 4, 5};
    

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> uniqueList = new ArrayList<>();

        for(Integer num : list){

            if(!uniqueList.contains(num)){
                uniqueList.add(num);
            }
        }

        System.out.println(uniqueList);

    }




    public static void removeDuplicatesUsingHashSet(){


        // System.out.println("\nusing stream ");

        //   List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);


        //   List<Integer> uniList = list.stream()
        //   .distinct()
        //   .toList();


        //   System.out.println(uniList);


        System.out.println("remove Duplicate Using Set");
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
      

        Set<Integer> uniList = new LinkedHashSet<>();
        
        for(int num : arr){

            uniList.add(num);
        }

        System.out.println("After remove Duplicate "+ uniList);



        List<Integer> list  = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> set = new LinkedHashSet<>();

        for(Integer num : list){
            set.add(num);
        }


        System.out.println("\n Removed Duplicate : "+ set);

    }



    public static void removeDuplicatesUsingStream(){


        System.out.println("\nusing stream ");

          List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);


          List<Integer> uniList = list.stream()
          .distinct()
          .toList();


          System.out.println(uniList);
    }



    public static void firstNonRepeatingCharcter(){

        System.out.println("\nFind First Occurance without Java 8 . ");

        String str =  "aabbcddee";

        int[] temp = new int[200];


        for(char ch : str.toCharArray()){
            temp[ch]++;
        }


        char result = 0 ;
        for (char c : str.toCharArray()) {
            
            if(temp[c] == 1){
                result = c;
                break;
            }
        }


        System.out.println("First Occurance : "+ result);

    }



    public static void pairSumBruteForce(){

        System.out.println("\npair sum brute force Approach");
        
        int [] arr = {1, 2, 7, 3, 6, -9, 11};
        int sum = 9;


        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++ ){

                if(arr[i] + arr[j] == sum){
                    System.out.println("pair found "+ arr[i] +" & "+ arr[j]);
                    // return;
                    found = true;
                }
            }

        }

        if(!found){
            System.out.println("No pair found");
        }
    }



    public static void findAllPairsUsingSet(){

        System.out.println("\nPair sum using set ");

        int [] arr = {1, 2, 7, 3, 6, -9, 11};
        int sum = 9;

        HashSet set = new HashSet<>();

        for(int num : arr){

            int diff = sum - num;

            if(set.contains(diff)){
                System.out.println("pair found "+ num +" & "+ diff);
            }

            set.add(num);

        }
    }


    public static void findAllPairsJava8(){

        System.out.println("\nPair sum using Java 8 Stream ");

        int [] arr = {1, 2, 7, 3, 6, -9, 11};
        int sum = 9;

        HashSet set = new HashSet<>();


        Arrays.stream(arr).forEach(num -> {

            int diff =  sum - num;

            if(set.contains(diff)){
                System.out.println("pair found "+ num +" & "+ diff);
            }
        
            set.add(num);
        });


    }




    public static void countNumberOfWordsfromSentence(){


        System.out.println("\n count Number Of Words from Sentence");


         String[] sentences = {
            "This is a sample sentence",
            "Another sentence"
    };


    int max = 0 ;
    String longestSentence = "";


    for(String str : sentences){

        int count = str.split(" ").length;

        if(count > max){
            max = count ;
            longestSentence = str;
        }
    }

    System.out.println("Sentence with most words: " + longestSentence);
    System.out.println("Word Count: " + max);


    }




 		
		

	// 1. Using charAt
	// 2. using toCharArray
	// 3. Using substring
	// 4. Using StringBuilder
	
	
	// 1. using charAt

    public static void reverse1(){
        
        String str = "datta";
        String rev = "";
        
        int n = str.length();
        
        for(int i = n -1; i >= 0 ; i--){
            
            rev = rev + str.charAt(i);
        }
        
        System.out.println("Reverse String is : "+ rev);
    }
    

	// 2. using toCharArray
    public static void reverse2(){
        
        String str = "datta";
        String rev = "";
        
        int n = str.length();
        
        char[] ch= str.toCharArray();
        
        for(int i = n -1; i >= 0 ; i--){
            
            rev = rev + ch[i];
        }
        
        System.out.println("Reverse String is : "+ rev);
    }
	
	
	// 3. 3. Using substring
    public static void reverse3(){
        
        String str = "datta";
        String rev="";
        
        int n = str.length();
        
        
        for(int i = n -1; i >= 0 ; i--){
            
            // rev = rev + ch[i];
            // sb.append(ch[i]);
            rev = rev + str.substring(i, i + 1);
        }
        
        System.out.println("Reverse String is : "+ rev);
    }
    
	// 4. using StringBuilder
    public static void reverse4(){
        
        String str = "datta";
     
        StringBuilder sb = new StringBuilder();
        
        int n = str.length();
        
        char[] ch= str.toCharArray();
        
        for(int i = n -1; i >= 0 ; i--){
            
            // rev = rev + ch[i];
            sb.append(ch[i]);
        }
        
        System.out.println("Reverse String is : "+ sb);
    }
	
	


    public static void ReverseStringUsingStack(){


        System.out.println("\nReverse String Using stack");

        String input = "datta";


        Stack<Character> stack = new Stack<>();


        for(Character ch : input.toCharArray()){

            stack.push(ch);
        }


        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }


        System.out.println("Reverse stack String is : "+ sb.toString());
    }

	
	// Without using 3rd varible
	public static void swip1(){
	    
	    
	    System.out.println("\n Swip using Without 3rd varible :");
	    
	    int a =  10;
	    int b =  20;

        System.out.println("a : "+ a + " , b :"+ b);

        b = b + a;
        a = b - a;
        b = b - a;
        
	    System.out.println("After Swip \n a : "+ a + " , b :"+ b);

	}
	
	
	// With using 3rd varible
	public static void swip2(){
	    
	    System.out.println("\n Swip using 3rd varible :");
	    
	    int a =  10;
	    int b =  20;
	    int temp = 0;

        System.out.println("a : "+ a + " , b :"+ b);

        
        temp = a;
        a = b;
        b = temp;


	    System.out.println("After Swip \n a : "+ a + " , b :"+ b);
	    
	}
	
	


}



