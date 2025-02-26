package Collection_Framework.Queue;

import java.util.PriorityQueue;

public class ex01_queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue<>();
        q.add("Vishal");
        q.add("Kritikita");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
