package Lista;
public class ListaMain
{
    public static void main(String [] args)
    {
        // Node nodo3 = new Node(6, null);
        // Node nodo2 = new Node(5, nodo3);
        // Node nodo1 = new Node(4, nodo2);
        // a lista encadeada é uma lista composta por um nodo
        //  que contém um valor e a posição do próximo
        Lista listaEncadeada = new Lista();

        listaEncadeada.insere(4);
        listaEncadeada.insere(40);
        listaEncadeada.insere(400);
        listaEncadeada.insere(4000);
        
        Node atual = listaEncadeada.primeiro;

        while (atual != null) 
        {
            System.out.print(atual.valor);
            
            if (atual.proximo != null) 
            {
                System.out.print(" -> ");
            }

            atual = atual.proximo;
        }
        System.out.println();
        
        listaEncadeada.remove();

        atual = listaEncadeada.primeiro;

        while (atual != null) 
        {
            System.out.print(atual.valor);
            
            if (atual.proximo != null) 
            {
                System.out.print(" -> ");
            }

            atual = atual.proximo;
        }
        System.out.println();

}
}