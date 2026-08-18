public class Node {
    
    public Node anterior=null;
    public Node proximo=null;
    public Item conteudo=null;

    public Node getAnterior() {
        return anterior;
    }
    public Item getConteudo() {
        return conteudo;
    }
    public Node getProximo() {
        return proximo;
    }
    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
    public void setConteudo(Item conteudo) {
        this.conteudo = conteudo;
    }
    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
    public Node(Item atual){
        setConteudo(atual);
    }

}
