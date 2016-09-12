
class LinkedList
{
    Node head;  
 
    
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    
    void printReverse(Node head)
    {
        if (head == null) return;
 
        // print list of head node
        printReverse(head.next);
 
        // After everything else is printed
        System.out.print(head.data+" ");
    }
 

 
    
    public void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
 
        
        new_node.next = head;
 
        
        head = new_node;
    }

    
    public static void main(String args[])
    {
        // Let us create linked list 1->2->3->4
        LinkedList llist = new LinkedList();
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
 
        llist.printReverse(llist.head);
    }
}
