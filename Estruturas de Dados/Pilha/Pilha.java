package Pilha;
public class Pilha
{
    int pilha[];
    int topo;

    //construtor
    public Pilha(int pilha [], int topo)
    {
        this.pilha = pilha;
        this.topo = topo;
    }

    // inserindo no topo da pilha
    public int [] inserePush(int valor)
    {
        pilha[topo] = valor;
        topo++;
        return pilha;
    }

    public int [] removePop()
    {
        pilha[topo-1] = -1;
        topo--;
        return pilha;
    }

    public void imprimePilha()
    {
        for(int j = 0; j < pilha.length; j++)
        {
            System.out.print(pilha[j] + " ");
        }
    }

    // retornando o valor de topo para fins de conferência
    public int getTopo()
    {
        return topo;
    }

}

