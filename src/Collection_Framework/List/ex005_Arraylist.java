package Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex005_Arraylist {
    public static void main(String[] args) {

        List arraylist = new ArrayList<>();

        arraylist.add("1");
        arraylist.add(123);
        arraylist.add(null);

        System.out.println("---------default for loop");
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));

        }
        System.out.println("---------for each loop");

        for (Object o:arraylist){
            System.out.println(o);
        }
        System.out.println("---------for each iterator");

        Iterator it= arraylist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
