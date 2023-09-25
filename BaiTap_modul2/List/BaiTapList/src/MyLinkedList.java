import org.w3c.dom.Node;

import javax.swing.*;

public class MyLinkedList {
    private Node head;
    private int numNode;

    public MyLinkedList(Object data){
 //Việc sử dụng Object cho phép bạn lưu trữ các loại dữ liệu khác nhau trong danh sách, chẳng hạn như chuỗi (String), số nguyên (Integer), số thực (Double), đối tượng tự định nghĩa, và nhiều kiểu dữ liệu khác
        head = new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data){
        Node temp = head;
        Node hoder;
    }
}
