public class MirrorBST{
    
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
    

    public static Node mirror(Node root){
        if(root==null){
            return null;
        }

        Node leftM = mirror(root.left);
        Node rightM=mirror(root.right);
        root.left=rightM;
        root.right=leftM;
        return root;

    }

     public static void preorderTraversal(Node root){
            if(root == null){
              return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    public static void main(String[] args) {
        int values[] ={8,5,10,3,6,11};
        Node root=null;
        
        for(int i =0 ; i < values.length ; i++){
           root= insert(root, values[i]);
        }

       preorderTraversal(root);
       root= mirror(root);
       System.out.println();
       preorderTraversal(root);
    }
}