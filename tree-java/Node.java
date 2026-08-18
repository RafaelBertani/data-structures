import java.util.ArrayList;

public class Node{

    public Node pai=null;
    public Node primeirofilho=null;
    public Node proximoirmao=null;
    public int valor;

    public Node(int i){
        this.valor=i;
    }

    public Node getPai() {
        return pai;
    }
    public Node getPrimeirofilho() {
        return primeirofilho;
    }
    public Node getProximoirmao() {
        return proximoirmao;
    }
    public int getValor() {
        return valor;
    }
    public void setPai(Node pai) {
        this.pai = pai;
    }
    public void setPrimeirofilho(Node primeirofilho) {
        this.primeirofilho = primeirofilho;
    }
    public void setProximoirmao(Node proximoirmao) {
        this.proximoirmao = proximoirmao;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public void imprime_filhos(){
        ArrayList<Node> lista_de_filhos = new ArrayList<Node>();
        Node filho_atual = this.primeirofilho;
        while(filho_atual!=null){
            lista_de_filhos.add(filho_atual);
            filho_atual = filho_atual.proximoirmao;
        }
        for(Node node : lista_de_filhos){
           System.out.println(node.valor); 
        }
    }
    public Node pai(){
        return this.pai;
    }
    public void imprime_pai(){System.out.println(this.pai.valor);}
    public boolean einterno(){if(this.primeirofilho!=null){return true;}else{return false;}}
    public void imprimeFilhosFolhas(){
        Node filho_atual = this.primeirofilho;
        while(filho_atual!=null){
            if(!filho_atual.einterno()){System.out.println(filho_atual.valor);}
            filho_atual = filho_atual.proximoirmao;
        }
    }
    public void preorder(){
        System.out.print(this.valor+" ");
        Node trab = this.primeirofilho;
        while(trab != null ){
            trab.preorder();
            trab = trab.proximoirmao;
        }
    }
    public void postorder() {
        Node trab = this.primeirofilho;
        while(trab != null ){
            trab.postorder();
            trab = trab.proximoirmao;
        }
        System.out.print(this.valor+" ");
    }

    public void dobra_filhos(){
        Node filho_atual=this.primeirofilho;
        filho_atual.valor=2*filho_atual.getValor();
        while(filho_atual.proximoirmao!=null){
            filho_atual=filho_atual.proximoirmao;
            filho_atual.valor=2*filho_atual.getValor();    
        }
    }
    public void dobra_pai(){
        this.pai.valor=2*this.pai.valor;
    }

}
