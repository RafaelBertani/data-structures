public class Main {
    public static void main(String args[]){
        Node n5 = new Node(5);
        Tree arvore = new Tree(n5);
        Node n4 = new Node(4);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n8 = new Node(8);
        Node n21 = new Node(21);
        Node n12 = new Node(12);
        Node n7 = new Node(7);
        Node n0 = new Node(0);
        Node n6 = new Node(6); 

        arvore.adiciona_filho(n5,n4);
        arvore.adiciona_filho(n5,n3);
        arvore.adiciona_filho(n5,n7);
        arvore.adiciona_filho(n4,n1);
        arvore.adiciona_filho(n4,n2);
        arvore.adiciona_filho(n3,n8);
        arvore.adiciona_filho(n8,n21);
        arvore.adiciona_filho(n8,n12);
        arvore.adiciona_filho(n7,n0);
        arvore.adiciona_filho(n7,n6);

        //EXERCÍCIO 1
        System.out.println("Filhos de n5");
        n5.imprime_filhos();
        System.out.println("Avô de n8");
        n8.pai().imprime_pai(); //imprime pai do pai e já testa 2
        System.out.println(n21.einterno()?"É interno":"Não é interno");
        System.out.println("Filhos folhas de n7");
        //arvore.adiciona_filho(n6,new Node(123));
        n7.imprimeFilhosFolhas();
        System.out.println("preorder");
        n5.preorder();
        System.out.println("\npostorder");
        n5.postorder();

        //EXERCÍCIO 2
        System.out.println("\nFilhos de n5");
        n5.imprime_filhos();
        System.out.println("Valor do pai de n8");
        n8.imprime_pai();
        System.out.println("Imprime filhos de n4 com valores dobrados");
        n4.dobra_filhos();
        n4.imprime_filhos();
        System.out.println("Imprime pai de n1 com valor dobrado");
        n1.dobra_pai();
        n1.imprime_pai();
        
    }
}
