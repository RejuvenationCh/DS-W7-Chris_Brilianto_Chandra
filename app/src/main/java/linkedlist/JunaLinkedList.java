package linkedlist;

public class JunaLinkedList {
    JunaNode head;

    public JunaLinkedList(){
        this.head = null;
    }

    public void tambahDepan(int data){
        JunaNode newNode = new JunaNode(data);
        if (head == null){
            head = newNode;
            return;
        }

    }

    public void cetakList(){
        JunaNode current = head;
        while (current != null){
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
    
}
