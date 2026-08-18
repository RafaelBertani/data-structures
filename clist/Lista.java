public class Lista{
    
    public int tamanho=0;
    public Node head; //sempre aponta para o sentinela

    //o próximo do último e o anterior do primeiro apontam para o sentinela
    //e por consequência (da lista duplamente ligada), o próximo do sentinela é o primeiro e o anterior do sentinela é o último

    public Lista(){
        Node sentinela = new Node(0);
        this.head=sentinela;
        sentinela.proximo=sentinela;
        sentinela.anterior=sentinela;
    }

    public void insere_no_comeco(Node n){
        if(this.tamanho==0){
            
            this.head.proximo=n;
            this.head.anterior=n;

            n.proximo=this.head;
            n.anterior=this.head;

            this.tamanho=1;

        }
        else{
            n.proximo=this.head.proximo;
            n.anterior=this.head;
            this.head.proximo.anterior=n;
            this.head.proximo=n;

            this.tamanho++;
        }
    }

    public void insere_no_fim(Node n){
        if (this.tamanho==0){ 
            n.proximo=this.head; 
            n.anterior=this.head; 
            this.head.proximo=n; 
            this.head.anterior=n; 
            this.tamanho=1;
        }
        else{
            n.proximo=this.head; 
            n.anterior=this.head.anterior;
            this.head.anterior.proximo = n; 
            this.head.anterior = n;
            this.tamanho++;
        }
    }
        
    public void imprime(){
        Node percorre = this.head.proximo;
        int i=1;
        System.out.println();
        while(i<=this.tamanho){
            System.out.print(percorre.item+" -> ");
            percorre=percorre.proximo;
            i++;
        }
    }

    public void deleteFirst(){ 
        if(this.tamanho==0){System.out.println("Lista vazia");} 
        else{
            if(this.tamanho==1){ 
                this.head.proximo=this.head;
                this.head.anterior=head;
                this.tamanho=0;
            }
            else{
                this.head.proximo.proximo.anterior=this.head;
                this.head.proximo=this.head.proximo.proximo;
                this.tamanho--;
            }
        }
    }

    public void deleteLast(){ 
        if (this.tamanho==0){System.out.println("Deleção inválida... Lista Vazia...");}
        else{
            if(this.tamanho==1){
                this.head.proximo=this.head; 
                this.head.anterior=this.head; 
                this.tamanho=0; 
            }
            else{ 
                this.head.anterior.anterior.proximo=this.head; 
                this.head.anterior=this.head.anterior.anterior; 
                this.tamanho--; 
            }
        }
    }
       
    public void insert_after_this(Node n, Node newnode){
        newnode.proximo=n.proximo;
        newnode.anterior=n;
        n.proximo.anterior=newnode;
        n.proximo=newnode;
        this.tamanho++;
    }

}
