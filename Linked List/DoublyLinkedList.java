public class DoublyLinkedList {

    public static class Node{
        int data;
        Node next;
        Node pre;

        Node(int data){
            this.data=data;
            this.next=null;
           this.pre=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;

        }
        newNode.next=head;
        head.pre=newNode;
        head=newNode;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


   public void removeFirst(){
    if(head==null){
        System.out.println("nothing to remove list is empty");
        return;

    }

    if(size==1){
        head=tail=null;
        size--;
        return;

    }
    
    head=head.next;
    head.pre=null;
    size--;


   }

   public void reverse(){
    Node previous=null;
    Node curr=head;

    while(curr != null){
        Node next = curr.next;
        curr.next=previous;
        curr.pre=next;
        previous=curr;
        curr=next;


    }

    head=previous;
   }
   public static void main(String[] args) {
      DoublyLinkedList dll= new DoublyLinkedList();
      dll.addFirst(4);
      dll.addFirst(3);
      dll.addFirst(2);
      dll.addFirst(1);
     
    
      dll.printList();
      dll.reverse();;
      dll.printList();
   } 
}
