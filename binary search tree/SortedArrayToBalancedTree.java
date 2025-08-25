public class SortedArrayToBalancedTree{
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void preorder(Node root){
            if(root == null){
              return;
            }

           System.out.print(root.data+" ");
           preorder(root.left);
           
           preorder(root.right);
    }


    public static Node createBalancedBST(int arr[],int start , int end){
     if(start > end){
        return null;
     }

     int mid=(start+end)/2;
     Node root=new Node(arr[mid]);
     root.left=createBalancedBST(arr,start, mid-1);
     root.right=createBalancedBST(arr,mid+1, end);
     
     return root;

    }

    public static void main(String[] args) {
        int values[] ={3,5,6,8,10,11,12};
        
        
      Node root= createBalancedBST(values,0,values.length-1);
     preorder(root);
    }
}