public class teste {

    public static void main(String[] args){
        
        Lista l = new Lista();

        Node N1 = new Node(1);
        Node N2 = new Node(2);
        Node N3 = new Node(3);
        Node N4 = new Node(4);
    
        l.insert_start(N1);
        l.insert_start(N2);
        l.insert_end(N3);
        l.insert_end(N4);

        l.imprime();

        if(l.busca(3)!=null){System.out.println("\nElemento está na lista");}
        else{System.out.println("\nElemento não está na lista");}

        l.deleta_proximo_de(N1);
        l.deleta_proximo_de(N1);
        //l.altera_conteudo(N1,10);
        l.imprime();
        l.deleta_fim();
        l.deleta_inicio();
        l.imprime();
    
    }

}
