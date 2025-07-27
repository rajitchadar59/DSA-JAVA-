

public class LinkedListQuestion2 {
    public static class  Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }

    }  

    public static Node head;
    public static Node tail;
    public static int size;

   public void addFirst(int data){
    Node newnode = new Node(data);
    size++;
    if(head==null){
      head=tail=newnode;  
      return;
    }      

    newnode.next=head;
    head=newnode;

   }


  public void addLast(int data){
    Node newnode = new Node(data);
    size++;
    if(head ==null){
     head=tail=newnode;
     return;
    }
    
    tail.next=newnode;
    tail=newnode;

  }

  public void printLL(){
    if(head==null){
        System.out.println("linked list is empty ");
        return;
    }
    Node temp=head;
    while(temp != null){
        System.out.print(temp.data+"----->");
        temp=temp.next;

    }
    System.out.print("null");
  }

 
 public boolean checkCycle(){
    

    Node slow=head;
    Node fast=head;

    while(fast != null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            return true;
        }
      

    }
    return false;
 }

 public void removeCycle(){
    

    Node slow=head;
    Node fast=head;
    boolean cycle= false;
    while(fast != null && fast.next != null){

        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            
           cycle=true;
           break;
        }

    }
      
      if(cycle==false){
        return;
      }

      slow=head;
      Node pre=null;


      while(slow != fast){
      pre=fast;
      slow=slow.next;
      fast=fast.next;

      }

      pre.next= null;
      
      
    }

    public Node getMid(Node head){
      Node slow= head;
      Node fast=head.next;

      while(fast != null && fast.next != null){
        slow=slow.next;
        fast= fast.next.next;

      }

      return slow;

    }


    public Node merge(Node h1 , Node h2){
      Node mergedLL= new Node(-1);
      Node temp = mergedLL;

      while(h1 != null && h2 != null){
        if(h1.data <= h2.data){
          temp.next=h1;
          h1= h1.next;
          temp=temp.next;
        }else{
          temp.next=h2;
          h2= h2.next;
          temp=temp.next;
        }
      }

      while(h1 != null){
        temp.next=h1;
        h1= h1.next;
        temp=temp.next;
      }

      while(h2 != null){
         temp.next=h2;
         h2= h2.next;
         temp=temp.next;
      }

      return mergedLL.next;

    }

   public Node  mergeSort(Node head){
   if(head==null || head.next==null){
    return head;

   }
   Node mid=getMid(head); 
   Node rightHead=mid.next;
   mid.next=null;
   Node newLeft=mergeSort(head);
   Node newRight= mergeSort(rightHead);
  
   return merge(newLeft , newRight);


   }

  

  public void zigZagLL(){
    Node slow=head;
    Node fast=head.next;

    while(fast != null && fast.next != null){
      slow=slow.next;
      fast=fast.next.next;

    }

    Node mid = slow;

   Node curr= mid.next;
   mid.next=null;
   Node pre=null;
   while(curr != null){
    Node next= curr.next;
    curr.next=pre;
    pre=curr;
    curr=next;

   }
   
   Node left=head;
   Node right=pre;
   
   Node nextleft;
   Node nextright;

   while(left != null && right != null){
    nextleft=left.next;
    left.next=right;
    nextright=right.next;
    right.next=nextleft;

    left=nextleft;
    right=nextright;

   }



  }
    public static void main(String[] args) {
LinkedListQuestion2 ll= new LinkedListQuestion2();
/*
   1---2---3
        ^   |
        |   |
        |___|

        
   head= new Node(1);
   Node temp = new Node(2);
   head.next=temp;
   head.next.next= new Node(3);
   head.next.next.next= temp;

   System.out.println(ll.checkCycle());
   ll.removeCycle();
   System.out.println(ll.checkCycle());

*/
  ll.addLast(1);
  ll.addLast(2);
  ll.addLast(3);
  ll.addLast(4);
  ll.addLast(5);

    ll.printLL(); 
    
    ll.zigZagLL();
    System.out.println();
    ll.printLL();
    
    



    
    }
}
