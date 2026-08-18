public class teste{
    
    public static void main(String args[]){

        Node N1 = new Node(1);
        Node N2 = new Node(2);
        Node N3 = new Node(3);

        Pilha p = new Pilha();

        p.empilha(N1);
        p.empilha(N2);
        p.empilha(N3);

        p.imprime();

        while(p.tamanho>0){
            p.desempilha();
            p.imprime();
        }

    }

}
