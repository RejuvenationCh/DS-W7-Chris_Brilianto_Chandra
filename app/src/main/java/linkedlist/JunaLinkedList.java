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
    
}
