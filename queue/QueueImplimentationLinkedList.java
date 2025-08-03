public class QueueImplimentationLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
          this.data=data;
          this.next=null;
        }
    }

    public static class Queue{
    public static Node  head=null;
    public static Node  tail=null;
    
    public static boolean isEmpty(){
        return head==null && tail==null;
    }

    public static void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;

    }

    public static int remove(){
        if(isEmpty()){
           System.out.println("queue empty");
           return -1;
           
        }
        int val=head.data;
        if(head.next == null){ 
            head=tail=null;
            return val ;  
        } 
        head=head.next;
        return val;

     

    }
   
    public static int peek(){
         if(isEmpty()){
            System.out.println("queue empty");
           return -1;
           
        }

        return head.data;

    }

    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(5);
        q.remove(); 
        
    }
}
