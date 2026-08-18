public class Lista{

    public Node head=null;
    public Node tail=null;
    public int size=0;

    public void insert(Node n){ //insere no final
        
        if(this.size==0){
            this.head=n;
            this.tail=n;
            this.size++;
        }
        else{

            n.anterior=this.tail;
            this.tail.proximo=n;
            
            this.tail=n;
            this.size++;

        }
    
    }

    public void insert_after(Node n, Node insert_after_this){

        if(this.size==0){return;}

        if(insert_after_this.proximo==null){ // se insert_after_this for o último
            
            this.tail=n;
            insert_after_this.proximo=n;
            n.anterior=insert_after_this;
            this.size++;
        
        }
        else{

            //X - [Y] - Z
        
            Node Z_aux=insert_after_this.proximo;
            insert_after_this.proximo.anterior=n; //z.ante = y=n;
            insert_after_this.proximo=n; //x.prox = y=n

            n.anterior=insert_after_this; //y.ante = x;
            n.proximo=Z_aux; //y.prox = z;

            this.size++;

        }
        
        
    }
    
    public void delete(Node n){

        // X - [Y] - Z

        if(this.size==0){return;}
        else if(n.anterior!=null && n.proximo!=null){
            Node X = n.anterior;
            Node Z = n.proximo;
            X.proximo=Z;
            Z.anterior=X;

            this.size--;
        }
        else if(n.anterior==null){
            this.head=n.proximo;
            if(this.size>1){n.proximo.anterior=null;}
            this.size--;
        }
        else if(n.proximo==null){
            this.tail=n.anterior;
            n.anterior.proximo=null;
            this.size--;
        }

    }

    public void print(){
        if(this.size==0){System.out.println("Lista vazia");return;}
        Node percorre = this.head;
        while(percorre!=null){
            System.out.println(""+percorre.conteudo.getNome()+" - "+percorre.conteudo.getValor());
            percorre=percorre.proximo;
        }
    }

    public void tnirp(){
        if(this.size==0){System.out.println("Lista vazia");return;}
        Node percorre = this.tail;
        while(percorre!=null){
            System.out.println(""+percorre.conteudo.getNome()+" - "+percorre.conteudo.getValor());
            percorre=percorre.anterior;
        }
    }

}