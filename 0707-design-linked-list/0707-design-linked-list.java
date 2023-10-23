class Node {
    int val;
    Node next;

    Node(int v){
        this.val = v;
        this.next = null;
    }
}

class MyLinkedList {
    Node head, tail;
    int length = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        if(index < 0 || index >= length) return -1;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        length++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > length) return;

        if(index == 0) addAtHead(val);
        else if(index == length) addAtTail(val);
        else {
            Node node = new Node(val);
            Node prev = null, curr = head;
            for(int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            node.next = curr;
            prev.next = node;
            length++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= length) return;

        if(index == 0) {
            head = head.next;
            if(head == null) tail = null;
        }
        else if(index < length) {
            Node prev = null, curr = head;
            int i = 0;
            for(i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            if(curr == tail) tail = prev;
        }
        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */