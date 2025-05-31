import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>h = new HashMap<>();
        h.put("id1",1);
        h.put("id1",2);
        h.put("id3",3);
        h.put("id4",0);
        h.forEach((key,value)->{
         System.out.println(key + " " + value);
         });
    }
}
