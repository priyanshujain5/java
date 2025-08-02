
import java.util.*;

class MarksCompare implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

public class comaparatorUse {

    public static void listPrinter(ArrayList<Integer> l) {
        for (int i : l)
            System.out.println(i);
    }

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(100);
        marks.add(90);
        marks.add(98);
        marks.add(78);
        marks.add(88);
        marks.add(91);

        // sort it in ascending order
        marks.sort(null);
        comaparatorUse.listPrinter(marks);
        // sort it in descding order
        // now sort method will not sort it in descing we need to pass a comapartor

        marks.sort(new MarksCompare());
        comaparatorUse.listPrinter(marks);

    }
}
