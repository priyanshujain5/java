import java.util.ArrayList;

class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(50);
        ls.add(40);
        System.out.println(ls.get(0));
        System.out.println(ls.size());
        for (int i : ls) {
            System.out.println(i);
        }
        System.out.println(ls.contains(2));

        ArrayList<String> days = new ArrayList<>(7);
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");
        days.add("sunday");

        System.out.println(days.size());
        System.out.println(days.remove(0));
        System.out.println(days);
        System.out.println(days.get(5));
        days.add(0, "monday");
        System.out.println(days);
        System.out.println(days.contains("sunday"));
    }
}