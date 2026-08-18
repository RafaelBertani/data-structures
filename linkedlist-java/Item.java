public class Item {

    public int valor;
    public String nome;
    public Item(int v, String n){
        setValor(v);
        setNome(n);
    }
    public String getNome() {
        return nome;
    }
    public int getValor() {
        return valor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
