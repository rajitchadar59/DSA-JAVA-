import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal{
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

    static class BinaryTree{
        static int idx=-1;

        public static Node buildTree(int nodes[]){
          idx++;
          if(nodes[idx]==-1){
            return null;

          }

          Node newnode = new Node(nodes[idx]);
          newnode.left=buildTree(nodes);
          newnode.right=buildTree(nodes);
         
          return newnode;
        }

    public static void preorderTraversal(Node root){
            if(root == null){
              return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }


     public static void inorderTraversal(Node root){
            if(root == null){
              return;
            }
            
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }

      public static void postorderTraversal(Node root){
            if(root == null){
              return;
            }
            
            postorderTraversal(root.left);
            postorderTraversal(root.right);
             System.out.print(root.data+" ");
        }



         public static void levelOrder(Node root){
           if(root==null){
            return;
          }

      Queue<Node> q= new LinkedList<>();
      q.add(root);
      q.add(null);

      while(!q.isEmpty()){
        Node currNode= q.remove();
        if(currNode==null){
          System.out.println();
          if(q.isEmpty()){
            break;
          }else{
            q.add(null);
          }
        }else{
           System.out.print(currNode.data);
           if(currNode.left != null){
             q.add(currNode.left);
           }

           if(currNode.right != null){
             q.add(currNode.right);
           }
        }
       
      }
    }

    }


     public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result; 
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size(); 
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currNode = q.remove();
                level.add(currNode.data);

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

            result.add(level); 
        }

        return result;

    }


    public static void main(String[] args){
       int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
       BinaryTree tree= new BinaryTree();
       Node root= tree.buildTree(nodes);
       
       System.out.print("preorder : ");
       tree.preorderTraversal(root);
       System.out.println();
       System.out.print("inorder : ");
       tree.inorderTraversal(root);
       System.out.println();
       System.out.print("postorder : ");
       tree.postorderTraversal(root);
       System.out.println();
       System.out.println("level order");
       tree.levelOrder(root);
       
    }
}