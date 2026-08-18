public class Node{

    public Node right;
    public Node left;
    public Node parent;

    public int item;

    public Node(int i){
        this.item=i;
        this.left=null;
        this.right=null;
    }

    
    public void binaryPreorder(){
        System.out.print(this.item+" "); 
        if (this.left != null)
        this.left.binaryPreorder();
        if (this.right != null)
        this.right.binaryPreorder();
    }
    
    public void binaryPostorder() { 
        if (this.left != null)
        this.left.binaryPostorder();
        if (this.right != null)
        this.right.binaryPostorder();
        System.out.print(this.item+" "); 
    }
    
    public void binaryInorder() { 
        if (this.left != null)
        this.left.binaryInorder();
        System.out.print(this.item+" "); 
        if (this.right != null)
        this.right.binaryInorder();
    } 
   
}
