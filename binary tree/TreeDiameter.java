public class TreeDiameter{
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
  

  public static int treeHeight(Node root){
    if(root==null){
        return 0;
    }

    int leftHeight= treeHeight(root.left);
    int rightHeight= treeHeight(root.right);
    int height=Math.max(leftHeight ,rightHeight)+1;
    return height; 
  }
   
   public static int diameter(Node root){//o(n^2)
    if(root==null){
        return 0;

    }

    int leftDia= diameter(root.left);
    int leftHeight=treeHeight(root.left);
    int rightDia= diameter(root.right);
    int rightHeight=treeHeight(root.right);
    int selfdia= leftHeight +rightHeight+1;

    return   Math.max(selfdia ,Math.max(leftDia , rightDia));
   }


  static class Info{
  int dia;
  int ht;

  Info(int dia , int ht){
    this.dia=dia;
    this.ht=ht;
  }
  
  }




   public static Info diaAp2(Node root){//o(n)
      if(root==null){
        return new Info(0 ,0);
      }
      Info leftInfo=diaAp2(root.left);
      Info rightInfo=diaAp2(root.right);

      int dia= Math.max(leftInfo.dia ,Math.max(rightInfo.dia , leftInfo.ht+rightInfo.ht+1));
      int ht=Math.max(leftInfo.ht , rightInfo.ht)+1;
      return new Info(dia ,ht);

   }



    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

       System.out.println("diametr is : "+ diameter(root));
       System.out.println("diametr is Ap2 : "+ diaAp2(root).dia);
    }
}