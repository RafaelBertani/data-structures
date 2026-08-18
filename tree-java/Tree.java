import java.util.ArrayList;

public class Tree {
    
    public Node raiz;
    public int n_de_elementos;

    public Tree(Node raiz){
        this.raiz=raiz;
        this.n_de_elementos=1;
    }

    public Node getRaiz() {
        return raiz;
    }
    public int getN_de_elementos() {
        return n_de_elementos;
    }
    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }
    public void setN_de_elementos(int n_de_elementos) {
        this.n_de_elementos = n_de_elementos;
    }

    public void adiciona_filho(Node pai, Node filho){
        if(pai.primeirofilho==null){
            pai.primeirofilho=filho;
            pai.primeirofilho.pai=pai;
            this.n_de_elementos++;
        }
        else{
            Node irmao_mais_novo = pai.primeirofilho;
            while(irmao_mais_novo.proximoirmao!=null){
                irmao_mais_novo=irmao_mais_novo.proximoirmao;
            }
            irmao_mais_novo.proximoirmao=filho;
            irmao_mais_novo.proximoirmao.pai=pai;
            this.n_de_elementos++;
        }
    }


    /*
    public ArrayList<Node> retorna_lista_de_filhos(Node n){
        ArrayList<Node> lista_de_filhos = new ArrayList<Node>();
        Node filho_atual = n.primeirofilho;
        while(filho_atual!=null){
            lista_de_filhos.add(filho_atual);
            filho_atual = filho_atual.proximoirmao;
        }
            return lista_de_filhos;
    }
    */
    
}
