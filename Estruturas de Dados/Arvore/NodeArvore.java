package Arvore;

public class NodeArvore {
    NodeArvore filhoEsquerdo;
    NodeArvore filhoDireito;
    int valor;

    public NodeArvore(int valor)
    {
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
        this.valor = valor;
    }
}
