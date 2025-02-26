package Collection_Framework.List;

import java.util.Stack;

public class ex010_stack {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.add("Vini");
        s.add("Divi");
        s.add("Vishal");
        s.add("Kumar");
        s.add("Kritika");
        s.add("Kriti");
        System.out.println(s);
        System.out.println(s.size());
        s.peek();
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
    }
}
