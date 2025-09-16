import java.util.HashMap;

public class hashMapOperations {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        
        map.put("apple", 9);
        map.put("mango", 10);
        map.put("Banana", 11);

        
        System.out.println(map.get("apple"));

        System.out.println(map.containsKey("apple"));

        System.out.println(map.containsValue(9));

        System.out.println(map.keySet());
        System.out.println(map.values());

        map.remove("apple", 9);
        System.out.println(map.keySet());
        System.out.println(map.values());


      
      System.out.println(map.size());

      System.out.println(map.isEmpty());

      System.out.println(map.getOrDefault("orange", 0));

      System.out.println(map.entrySet());

      map.putIfAbsent("orange", 12);
      map.replace("mango", 22);
      System.out.println(map.entrySet());




        }
    
}
