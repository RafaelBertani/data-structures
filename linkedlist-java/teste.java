public class teste {

    public static void main(String args[]){
        Lista l=new Lista();
        Item it1 = new Item(123,"oi");
        Node n1 = new Node(it1);
        Item it2 = new Item(456,"oi");
        Node n2 = new Node(it2);
        Item it3 = new Item(789,"oi");
        Node n3 = new Node(it3);
        l.insert(n1);
        l.insert(n3);
        l.insert_after(n2, n1);
        l.print();
        System.out.println("--------");
        l.tnirp();
        System.out.println("--------");
        l.delete(n2);
        l.print();
        System.out.println("--------");
        l.delete(n3);
        l.print();
        System.out.println("--------");
        l.delete(n1);
        l.print();
    }

}
