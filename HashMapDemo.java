import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "pj");
        mp.put(2, "aj");
        mp.put(3, "kc");
        System.out.println(mp);
        System.out.println(mp.get(8));

        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 50);
        fruits.put("banana", 10);
        fruits.put("orange", 20);
        fruits.put("grape", 40);
        fruits.put("guava", 80);
        System.out.println(fruits.size());

    }

}
