public class teste{
    public static void main(String args[]){

        int[] array = {3,7,8,9,10,5};
        arvorebin b = new arvorebin();
        b.inciar_arvore_com_valores(array);

        // b.InserirItem(33);

        b.Preorder();
        b.Postorder();
        b.Inorder();

        b.procurar(b.root,5);
        System.out.printf(b.notificar?", valor encontrado":", valor não encontrado");
        b.notificar=false;

        System.out.printf("\nO menor valor é: %d",b.retorna_menor());

        System.out.printf("\nA quantidade de nós da árvore é: %d",b.quantidade());

        System.out.printf("\nA média dos valores desta árvore é: %d",b.media());b.soma=0;

        System.out.printf("\nA altura máxima da árvore é: %d",b.altura());

        System.out.printf("\nA quantidade de NULLs é: %d",b.contagem());b.quantnulls=0;
        
        System.out.printf("\nA quantidade de múltimplos de 2: %d",b.multiplos());b.multiplosdedois=0;

        System.out.printf("\nA soma dos elementos é: %d",b.somadoselementos());b.soma=0;

    }
}
