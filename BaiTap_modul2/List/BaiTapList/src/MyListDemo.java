
import java.util.Arrays;

public class MyListDemo<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;
    public MyListDemo(){
        element = new Object[DEFAULT_CAPACITY];
    }
    private void ensurecapa(){
        int newElement = element.length * 2;
        element = Arrays.copyOf(element, newElement);

    }

    public void add(E e){
        if(size == element.length ){//nhap phan vao neu size bằng độ dài thì gấ đôi mảng
            ensurecapa();
        }
        element[size++] = e;
    }

    public E get(int i){
        if(i >= size || i < 0){//kiem tra i co nam trong khoang nay khong
            System.out.println("Index: " + i + ", Size " + i );
        }
        return (E) element[i];

    }
    public static class MyListTest {
        public static void main(String[] args) {
            MyListDemo<Integer> listInteger = new MyListDemo<Integer>();
            listInteger.add(1);
            listInteger.add(2);
            listInteger.add(3);
            listInteger.add(3);
            listInteger.add(4);

            System.out.println("element 4: "+listInteger.get(4));
            System.out.println("element 1: "+listInteger.get(1));
            System.out.println("element 2: "+listInteger.get(2));

            listInteger.get(6);
            System.out.println("element 6: "+listInteger.get(6));
        }
    }
}
