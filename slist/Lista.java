public class Lista{
 
    public int tamanho=0;
    public Node head;
    public Node tail;

    public void insert_end(Node n){

        if(this.tamanho==0){
            this.head=n;
            this.tail=n;
            this.tamanho=1;
        }
        else{
            this.tail.next=n;  //o próximo do último é o novo último
            this.tail=n; //o último é o último inserido
            this.tamanho++;
        }

    }

    public void insert_start(Node n){
        
        if(this.tamanho==0){
            this.head=n;
            this.tail=n;
            this.tamanho=1;
        }
        else{
            n.next=this.head;  //o próximo do novo primeiro é o antigo primeiro
            this.head=n; //o primeiro é o novo
            this.tamanho++;
        }
    
    }

    public void imprime(){
        if(this.tamanho==0){System.out.println("\nLista vazia.");}
        else{System.out.println();}
        Node percorre = this.head;
        while(percorre!=null){
            if(percorre.next==null){System.out.print(percorre.item);}
            else{System.out.print(percorre.item+" -> ");}
            percorre=percorre.next;
        }
    }

    public int deleta_proximo_de(Node n){
        //Node deletado=n.next;
        //Node proximo_do_proximo=n.next.next;
        if(n.next==null){ //caso não haja próximo
            return 0;
        }
        else if(n.next.next==null){ //caso o próximo seja o último
            n.next=null;
            this.tail=n;
            this.tamanho--;
            return 1;
        }
        else{
            n.next=n.next.next;
            this.tamanho--;
            return 1;
        }
        
    }

    public void altera_conteudo(Node n, int i){
        n.item=i;
    }

    public void deleta_inicio(){
        if(this.tamanho==0){return;}
        else if(this.tamanho==1){this.head=null;this.tail=null;this.tamanho=0;return;}
        else{
            this.head=this.head.next;
            this.tamanho--;
            return;
        }
    }

    public void deleta_fim(){
        if(this.tamanho==0){return;}
        else if(this.tamanho==1){this.head=null;this.tail=null;this.tamanho=0;return;}
        else{
            
            Node percorre = this.head;
            while(percorre.next.next!=null){
                percorre=percorre.next;
            }

            Node penultimo = percorre;
            
            penultimo.next=null;
            this.tail=penultimo;
            this.tamanho--;
            return;
        }
    }

    public Node busca(int i){
        Node percorre = this.head;
        while(percorre!=null){
            if(percorre.item==i){return percorre;}
            percorre=percorre.next;
        }
        return null;
    }

}
