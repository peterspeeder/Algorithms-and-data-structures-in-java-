package Package;
import java.util.*;

public class HashTable_ {
  public static void main(String[] args) {
    Hashtable<String, String> table = new Hashtable<>(21);
    
    table.put("100", "Spongebob");
    table.put("123", "Patrick");
    table.put("321", "Sandy");
    table.put("555", "Squidward");
    table.put("777", "Gary");
    
    // table.remove(777);
    
    for (String key : table.keySet()) {
      System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table.get(key));
    }
    
    
  }
}
