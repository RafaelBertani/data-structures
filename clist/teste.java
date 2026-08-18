public class teste{
    
    public static void main(String args[]){

        Node N1 = new Node(1);
        Node N2 = new Node(2);
        Node N3 = new Node(3);
        Node N4 = new Node(4);
        Node N5 = new Node(5);
        Node N6 = new Node(6);

        Lista l = new Lista();

        l.insere_no_comeco(N1);
        l.insere_no_comeco(N2);
        l.insere_no_fim(N3);
        l.insert_after_this(N1,N4);

        l.imprime();

        l.deleteLast();
        l.imprime();
        l.deleteFirst();
        l.imprime();

    }

}
