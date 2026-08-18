package Fila;
public class Fila
{
    int primeiro;
    int ultimo;
    int [] vetor;

    public Fila()
    {
        this.primeiro = 0;
        this.ultimo = 0;
    }

    public void enfileira(int valor, int [] vetor)
    {
        primeiro = vetor.length-1;

        if(vetor[primeiro] == 0)
        {
            vetor[primeiro] = valor;
        }
        else if (vetor[primeiro] != 0)
        {
            int aux = primeiro;

            while(vetor[aux] != 0)
            {
                aux--;
            }
            vetor[aux] = valor;
            ultimo = aux;
        }
        else
        {
            System.out.println("Não é possível inserir.");
        }
        
    }
    
    public void desenfileira(int [] vetor)
    {
        if(vetor[primeiro] != 0)
        {
            vetor[primeiro] = 0;
        }
        else
        {
            System.out.println("Não há elemento para remover");
        }
        
    }
}