public class Fila{
    
    public Node head;
    public Node tail;
    public int tamanho;

    public Fila(){
        this.head=null;
        this.tail=null;
        this.tamanho=0;
    }

    public void coloca_na_fila(Node n){
        if(this.tamanho==0){
            this.head=n;
            this.tail=n;
            this.tamanho=1;
        }
        else{
            n.antes=this.tail; //o antes do novo é o antigo novo
            n.depois=null;  //não há nada depois do novo
            this.tail.depois=n;   //o depois do antigo novo é o novo novo
            this.tail=n;    //a cauda da fila vira o novo
            this.tamanho++;
        }
    }

    public void tira_na_fila(){
        if(this.tamanho==0){
            return;
        }
        else if(this.tamanho==1){ 
            this.head = null; 
            this.tail = null;
            this.tamanho=0; 
        }
        else{
            //this.head.item;
            this.head=this.head.depois; //o primeiro da fila é o antigo segundo
            this.head.antes=null; //o antes do primeiro (antigo segundo) vira null
            this.tamanho--;
        }
    }

    public void imprime(){
        if(this.tamanho==0){System.out.println("\nLista vazia");}
        System.out.print("\nComeço da fila: ");
        Node percorre=this.head;
        while(percorre!=null){
            System.out.print(percorre.item+" ");
            percorre=percorre.depois;
        }
    }

}


