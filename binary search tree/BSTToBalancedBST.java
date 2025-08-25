import java.util.ArrayList;

public class BSTToBalancedBST{
    
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

   public static void preorderTraversal(Node root){
            if(root == null){
              return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

    public static void inorder(Node root , ArrayList<Integer> list){
            if(root == null){
              return;
            }

           inorder(root.left ,list);
           list.add(root.data);
           inorder(root.right ,list);
    }

    public static Node insert(Node root ,int val){
     if(root==null){
       root=  new Node(val);
       return root;
     }

     if(root.data > val){
      root.left= insert(root.left, val);
     }else{
      root.right= insert(root.right, val);
     }

     return root;
    }

    public static Node createBalancedBST( ArrayList<Integer> list,int start , int end){
     if(start > end){
        return null;
     }

     int mid=(start+end)/2;
     Node root=new Node(list.get(mid));
     root.left=createBalancedBST(list,start, mid-1);
     root.right=createBalancedBST(list,mid+1, end);
     
     return root;

    }


    public static Node bstToBalancedBST(Node root){
         ArrayList<Integer> list = new ArrayList<>();
          inorder(root, list);
          root= createBalancedBST(list,0,list.size()-1);
         return root;

    }

    public static void main(String[] args) {
        int values[] ={8, 6, 5, 3, 10, 11, 12};
        Node root=null;
        for(int i =0 ; i < values.length ; i++){
           root= insert(root, values[i]);
        }

        preorderTraversal(root);
        root=bstToBalancedBST(root);
        System.out.println();
        preorderTraversal(root);
  
    }
}