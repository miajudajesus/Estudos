package Pilha;
public class PilhaMain {
    public static void main(String [] args)
    {
        int [] pilha = new int [5];
        Pilha empilhar = new Pilha(pilha, 0);
        
        empilhar.inserePush(3);
        empilhar.inserePush(7);
        empilhar.inserePush(8);
        empilhar.inserePush(12);
        empilhar.inserePush(13);

        System.out.println();

        empilhar.imprimePilha();

        System.out.println();
        
        System.out.println("Topo = " + empilhar.getTopo());
        
        empilhar.removePop();

        empilhar.imprimePilha();

        empilhar.inserePush(9);

        System.out.println();

        empilhar.imprimePilha();

        System.out.println();

    }
}
