package Demo;

import java.util.LinkedList;

public class MethodAddAll {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Thu 2");
        linkedList.add("Thu 3");
        linkedList.add("Thu 4");

        LinkedList<String> linkedListExtri = new LinkedList<>();
        linkedListExtri.add("Thu 5");
        linkedListExtri.add("Thu 6");
        linkedListExtri.add("Thu 7");
        linkedListExtri.add("Chu Nhat");

        linkedList.addAll(linkedListExtri);
        System.out.println(linkedList);
    }
}
