import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(11);
        ls.add(14);
        ls.add(10);
        ls.addFirst(6); // add element at head of list
        ls.addLast(5); // add element at last of list
        System.out.println(ls.get(3));
        System.out.println(ls.getFirst());
        System.out.println(ls.getLast());
        for (int i : ls)
            System.out.println(i);

        System.out.println(ls.contains(56));
        ls.remove();
        ls.removeFirst();
        for (int i : ls)
            System.out.println(i);

    }
}
