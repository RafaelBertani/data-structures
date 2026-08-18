public class Pilha{

    public Node topo=null;
    public int tamanho=0;

    public void empilha(Node n){

        n.abaixo=this.topo; //n.abaixo=this.topo.abaixo;
        this.topo=n;
        this.tamanho++;

    }

    public void desempilha(){

        if(this.tamanho!=0){
            int valor=this.topo.item;
            this.topo=this.topo.abaixo;
            this.tamanho--;    
        }
        

    }

    public void imprime(){
        if(this.tamanho==0){System.out.println("Pilha vazia");return;}
        Node percorre = this.topo;
        while(percorre!=null){
            System.out.print(percorre.item+" -> ");
            percorre=percorre.abaixo;
        }
        System.out.println();
    }

}

