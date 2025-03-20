// package dsa;
import java.security.Key;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        // insert operation
        map.put("Imdia",120);
        map.put("us",30);
        map.put("china",150);
        System.out.println(map);
        map.put("china",180);
        System.out.println(map);
// search operation
if(map.containsKey("china")){
    System.out.println("yes");

}
else{
    System.out.println("no");
}
System.out.println(map.get("china"));
System.out.println(map.get("Indonasia"));
for(Map.Entry<String,Integer>e:map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}
Set<String> Keys=map.keySet();
for(String Key:Keys){
    System.out.println(Key+ " "+ map.get(Key));
}
map.remove("china");
System.out.println(map);
    }

}
