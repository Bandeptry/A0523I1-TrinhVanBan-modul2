package Demo;

import java.util.LinkedList;
import java.util.ListIterator;

public class SuDungListIterator {
    public static void main(String[] args) {
        LinkedList<Float> linkedList = new LinkedList<>();
        linkedList.add(22.32f);
        linkedList.add(12.3f);
        linkedList.add(1.3f);
        linkedList.add(2.5f);
        linkedList.add(2,56.3f);
        linkedList.addFirst(9.3f);
        linkedList.addLast(10.0f);

        ListIterator<Float> floatListIterator = linkedList.listIterator();

        System.out.println("Các phần tử có trong linkedList là: ");
        System.out.println("Các phần tử có trong linkedList sau khi thêm:");
        System.out.println(linkedList);
        System.out.println("Duyệt xuôi (từ đầu đến cuối danh sách):");
        while (floatListIterator.hasNext()){
            System.out.print(floatListIterator.next() + "\t");
        }
        System.out.println("Duyet nguoc(tu cuoi danh sach)");
        while (floatListIterator.hasPrevious()){
            System.out.print(floatListIterator.previous()+"\t");
        }
    }
}
