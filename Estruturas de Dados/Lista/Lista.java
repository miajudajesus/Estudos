package Lista;
public class Lista {
    Node primeiro;
    Node ultimo;

    public Lista()
    {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void insere(int valor)
    {
        Node nodo1 = new Node(valor, null);
        if(ultimo == null)
        {
            ultimo = nodo1;
            primeiro = nodo1;
        }
        else
        {
            ultimo.proximo = nodo1;
            ultimo = nodo1;
        }      
    }

    public void remove()
    {
        if(primeiro == null)
        {
            System.out.println("Fila vazia, impossível remover.");
        }
        else
        {
            primeiro = primeiro.proximo;
            if(primeiro == null)
            {
                ultimo = null;
            }
        }
        
    }
}
