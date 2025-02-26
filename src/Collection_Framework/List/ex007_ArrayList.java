package Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex007_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList<>();
        marks.add(90);
        marks.add(93);
        marks.add(75);
        marks.add(91);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
