public class DFS{
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

   public static Node dfs(Node root, int k) {
    if (root == null) {
        return null;
    }

    // left subtree
    Node leftAns = dfs(root.left, k);
    if (leftAns != null) return leftAns;

    // right subtree
    Node rightAns = dfs(root.right, k);
    if (rightAns != null) return rightAns;

    // 👇 current node check sabse last
    if (root.data == k) {
        return root;
    }

    return null;
}

 
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        int k=7;
        System.out.println(dfs(root ,k).data);  
        
    }
}