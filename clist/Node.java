public class Node{
    
    public int item;
    public Node proximo;
    public Node anterior;

    public Node(int i){
        this.anterior=null;
        this.proximo=null;
        this.item=i;
    }

}
