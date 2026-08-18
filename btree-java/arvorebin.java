public class arvorebin{

    public Node root;
    public int tamanho;   
    
    public arvorebin(Node root){
        this.root=root;
    }

    public arvorebin(){
        this.root=null;
    } 

    public void InserirItem(int it){

        if(this.tamanho==0){this.root=new Node(it);this.tamanho++;return;}
        else{
            Node atual_avalia = this.root;
            Node a_ser_inserido = new Node(it);
            while(true){
                if(it<atual_avalia.item){
                    if(atual_avalia.left==null){
                        a_ser_inserido.parent=atual_avalia;
                        atual_avalia.left=a_ser_inserido;
                        this.tamanho++;
                        return;
                    }
                    else{atual_avalia=atual_avalia.left;}
                }
                else{
                    if(atual_avalia.right==null){
                        a_ser_inserido.parent=atual_avalia;
                        atual_avalia.right=a_ser_inserido;
                        this.tamanho++;
                        return;
                    }
                    else{atual_avalia=atual_avalia.right;}
                }
            }
        }
    }

    public void inciar_arvore_com_valores(int[] array){
        for (int i : array) {
            InserirItem(i);
        }
    }

    public void Preorder(){
        System.out.println("\nPreorder: ");
        this.root.binaryPreorder();
    }
    
    public void Postorder(){
        System.out.println("\nPosorder: "); 
        this.root.binaryPostorder();
    }
    
    public void Inorder(){
        System.out.println("\nInorder: ");
        this.root.binaryInorder();
    }
    
    public boolean notificar;

    public void procurar(Node atual,int v){

        if(v>atual.item && atual.right==null){this.notificar=false;System.out.printf("\n%d não está presente",v);return;}
        if(v<atual.item && atual.left==null){this.notificar=false;System.out.printf("\n%d não está presente",v);return;}

        if(atual.item==v){this.notificar=true;System.out.printf("\n%d está presente",v);} //se encontrou
        else{
            if(v>atual.item){procurar(atual.right,v);}
            else{procurar(atual.left,v);} //v<atual.item
        }

    }

    public int retorna_menor(){
        
        if(this.tamanho==0){return -1;}
        
        Node atual = this.root;
        while(atual.left!=null){
            atual=atual.left;
        }
        return atual.item;
    
    }

    public int quantidade(){
        return this.tamanho;
    }

    public int soma=0;

    public void percorre_somando(Node atual){
        if(atual.left!=null){this.percorre_somando(atual.left);}
        this.soma+=atual.item;
        if(atual.right!=null){this.percorre_somando(atual.right);}
    }

    public int media(){
        percorre_somando(this.root);
        return this.soma/this.tamanho;
    }

    public int somadoselementos(){
        percorre_somando(this.root);
        return this.soma;
    }

    public int quantnulls=0;

    public void percorre_contando(Node atual){
        if(atual.right==null && atual.left==null){this.quantnulls+=2;}
        else if(atual.right==null){this.quantnulls++;}
        else if(atual.left==null){this.quantnulls++;}
        else{}
        
        if(atual.left!=null){this.percorre_contando(atual.left);}
        if(atual.right!=null){this.percorre_contando(atual.right);}
        
    }

    public int contagem(){
        percorre_contando(this.root);
        return this.quantnulls;
    }

    public int multiplosdedois=0;

    public void percorremultiplos(Node atual){
        
        if(atual.item%2==0){this.multiplosdedois++;}
        
        if(atual.left!=null){this.percorremultiplos(atual.left);}
        if(atual.right!=null){this.percorremultiplos(atual.right);}
    
    }

    public int multiplos(){
        this.percorremultiplos(this.root);
        return multiplosdedois;
    }

    public int maxDepth(Node node){
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
 
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public int altura(){
        return maxDepth(this.root);
    }

}
