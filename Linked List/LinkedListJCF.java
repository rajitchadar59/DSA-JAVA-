import java.util.LinkedList;
public class LinkedListJCF {
    public static void main(String[] args) {
    LinkedList<Integer> ll= new LinkedList<>();
    //addlast 
    ll.addLast(1);
    ll.addLast(2);
    //add first
    ll.addFirst(0);
    //add at middle at any index
    ll.add(2, 4);

    //set(index , element)
    ll.set(3, 0);
    System.out.println(ll);

    //remove first
    ll.removeFirst();
    System.out.println(ll);

    //remove last
    ll.removeLast();
    System.out.println(ll);

    //remove at index remove(index);
    ll.remove(0);
    System.out.println(ll);
    

    //size of a linked list
    System.out.println("size of linked list is "+ll.size());
   

    // get element by index get(index)
    System.out.println(ll.get(0));

    System.out.println(ll.contains(4));
    }
}
