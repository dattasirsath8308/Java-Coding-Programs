import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//  8 – Filter a Map by keys and values

public class _5_filterMap {
    public static void main(String[] args) {
        


        System.out.println("1. Filter Map by Keys : ");
        FilterMapbyKeys();


        System.out.println("2. Filter Map by value : ");
        // FilterMapbyValues1();


        System.out.println("3. Filter Map by both Keys and Values : ");
        // Filter_Map_by_both();  //Keys and Values

  
    }


    public static void FilterMapbyKeys()
    {

        Map<Integer,String> hMap = new HashMap<>();
        hMap.put(1, "Datta");
        hMap.put(2, "Nagesh");
        hMap.put(3, "Macho");

        Map<Integer,String> result = hMap.entrySet()
        .stream()
        .filter(map -> map.getKey().intValue() <=2)
        .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println(" Result : "+result );
    }


    public static void FilterMapbyKeys2()
    {

        Map<Integer,String> hMap1 = new HashMap<>();
        hMap1.put(1, "Datta");
        hMap1.put(2, "Nagesh");
        hMap1.put(3, "Macho");


        Map<Integer,String> result =  hMap1.entrySet().stream()
        .filter(m -> m.getKey().intValue() <=2)
        .collect(Collectors.toMap(m -> m.getKey, m -> m.getValue()));

        System.out.println(result);


    }
    

    /*
    public static void FilterMapbyValues1()
    {

        Map<Integer,String> hMap = new HashMap<>();
        hMap.put(1, "Datta");
        hMap.put(2, "Nagesh");
        hMap.put(3, "Macho");

        Map<Integer,String> result = hMap.entrySet()
        .stream()
        .filter(map -> "Nagesh".equals(map.getValue()))
        .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println(" Result : "+result );
    }




    
    public static void FilterMapbyValues()
    {

        Map<Integer,String> hMap = new HashMap<>();
        hMap.put(1, "Datta");
        hMap.put(2, "Nagesh");
        hMap.put(3, "Macho");

        Map<Integer,String> result = hMap.entrySet()
        .stream()
        .filter(map -> "Nagesh".equals(map.getValue()))
        .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println(" Result : "+result );
    }
    
    public static void Filter_Map_by_both()
    {

        Map<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(1, "ABC");
      hmap.put(2, "XCB");
      hmap.put(3, "ABB");
      hmap.put(4, "ZIO");

      Map<Integer, String> result = hmap.entrySet()
         .stream()
         .filter(p -> p.getKey().intValue() <= 2) //filter by key
         .filter(map -> map.getValue().startsWith("A")) //filter by value
         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

     System.out.println("Result: " + result);
     
   }

   */
   


   void getHashMpa()
   {
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
 
    // Adding Key and Value pairs to HashMap
    hashmap.put(11,"Value1");
    hashmap.put(22,"Value2");
    hashmap.put(33,"Value3");
    hashmap.put(44,"Value4");
    hashmap.put(55,"Value5");

    Set s = hashmap.entrySet();

    Iterator itr = s.iterator();

     while(itr.hasNext())
     {
        Map.Entry me = (Map.Entry) itr.next();


     }



   }

}
