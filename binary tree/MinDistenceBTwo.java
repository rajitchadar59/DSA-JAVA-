public class MinDistenceBTwo{
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


   public static Node lcaAp2(Node root , int n1 , int n2){
    if(root==null){
        return null;
    }

    if(root.data==n1 || root.data==n2){
        return root;
    }

   Node leftLca= lcaAp2(root.left, n1, n2);
   Node rightLca = lcaAp2(root.right, n1, n2);

   if(rightLca==null){
    return leftLca;
   }

   if( leftLca==null){
    return rightLca;
   }

   return root;
   }

  
   public static int lcaToRootDist(Node root , int n){
    if(root==null){
        return -1;
    }

    if(root.data==n){
        return 0;
    }

    int leftDist=lcaToRootDist(root.left, n);
    int rightDist=lcaToRootDist(root.right, n);

    if(leftDist==-1 && rightDist==-1){
        return -1;
    }
    else if(leftDist==-1){
        return rightDist+1;
    }
    else{
        return leftDist+1;
    }

   }
   public static int minDis(Node root , int n1 , int n2){

          Node lca= lcaAp2(root, n1, n2);

          int dist1=lcaToRootDist(lca, n1);
          int dist2=lcaToRootDist(lca, n2);

          return dist1+dist2;
   }
 
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        int n1=4; int n2=3;
        System.out.println(minDis(root, n1, n2));
    }
}