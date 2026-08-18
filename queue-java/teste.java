public class teste{
    public static void main(String args[]){
        
        Node N1 = new Node(1);
        Node N2 = new Node(2);
        Node N3 = new Node(3);

        Fila f = new Fila();

        f.coloca_na_fila(N1);
        f.coloca_na_fila(N2);
        f.coloca_na_fila(N3);

        f.imprime();

        while(f.tamanho>0){
            f.tira_na_fila();
            f.imprime();
        }
        
    }
}
