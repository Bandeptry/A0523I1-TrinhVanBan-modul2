package BaiTap1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        if(capacity >= 0){
            element = new Object[capacity];
        }else{
            throw new IllegalArgumentException(capacity+"Khong hop le");
        }
    }
    public boolean add(E elements){//thêm phân tử vào cuối mảng
        if(element.length == size){
            ensureCapacity(2);
        }
        element[size] = elements;
        size++;
        return true;
    }

    void add(int index, E elements){
        if(element.length == size){
            ensureCapacity(2);
        }else if(index > element.length){
            throw new IllegalArgumentException(index+"Khong hop le");
        }
        if(element[index] == null){
            element[index] = elements;
            size++;
        }else {
            for (int i = size + 1; i >= index; i--){
                element[index] = elements;
                size++;
            }
        }
    }
    void ensureCapacity(int capacity){//tăng số số phần tử trong mảng
        if(capacity >= element.length){
            int newElement = element.length + capacity;
            element = Arrays.copyOf(element, newElement);
        }else {
            throw new IllegalArgumentException(capacity+" Khong hop le");
        }
    }
     E remove(int index){
        if(index < 0 || index > element.length){
            throw new IllegalArgumentException(index + " Khong hop le");
        }
        E elements = (E) element[index];
            for(int i = index; i < size - 1; i++){
                element[i] = element[i+1];
        }
         element[size - 1] = null;
         size--;
         return (E) element;
    }
    public int indexOf(E elements){
        int index = -1;
        for(int i = 0; i < element.length; i++){
            if(elements.equals(element[i])){
                return i;
            }
        }
        return index;
    }
    public E get(int i){
        return (E) element[i];
    }
    public boolean contains(E element){
        return indexOf(element) >= 0;
    }

    public MyList<E> clone(){
        MyList <E> copy = new MyList<>();
        copy.element = Arrays.copyOf(element, size);
        copy.size = size;
        return copy;
    }

}
