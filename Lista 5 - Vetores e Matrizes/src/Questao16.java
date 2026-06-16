/*
Faça um programa que leia um vetor A com 5 valores inteiros e positivos,
garanta isso. A seguir, o programa deve:

(a) ler um valor inteiro p ositivo e removê-lo do vetor. Quando um elemento
é removido, os elementos posteriores são deslocados e na posição livre,
que fica ao final, é inserido o valor -1. 

(b) ler um outro valor inteiro p ositivo e inclui-lo no vetor se ainda existir
uma p osição livre. O novo valor deve ser inserido na primeira p osição
livre (que tiver -1). Essa op eração dever ser implementada p or um
méto do.

(c) ler mais um valor inteiro p ositivo, uma p osição p e substituir o el-
emento atual da p osição p p elo valor lido.

(d) ler ainda mais um valor p ositivo. O programa informar a p osição do
valor lido no vetor. 
*/

import java.util.*;

public class Questao16 
{
    public static void main(String[]args)
    {
        int lista[] = new int [5];

        Scanner in = new Scanner(System.in);

        int valor = 0;
        int tamanho = lista.length;
        int numero = 0;

        for(int i = 0; i < tamanho; i++)
        {
            System.out.println("Informe um valor para a lista: ");
            valor = in.nextInt();
            lista[i] = valor;
        }

        /*
        (a) ler um valor inteiro positivo e removê-lo do vetor. Quando um elemento
        é removido, os elementos posteriores são deslocados e na posição livre,
        que fica ao final, é inserido o valor -1.
        */
        System.out.println("Informe o número a ser removido: ");
        numero = in.nextInt();

        // identificando o número a ser removido
        for(int i = 0; i < tamanho; i++)
        {
            if(lista[i] == numero)
            {
                lista[i] = -1;
            }
            System.out.print(lista[i]);
        }

        System.out.println();

        // percorrendo o array para empurrar o menos 1 para o final dele.
        int proximo = 0;

        for(int j = 0; j < tamanho; j++)
        {
            proximo = j + 1;
            if(lista[j] == -1 && proximo < tamanho)
            { 
                lista[j] = lista[proximo];
                lista[proximo] = -1;
            }
            else if(lista[j] == -1 && proximo == tamanho)
            {
                lista[j] = -1;
            }
            System.out.print(lista[j]);
        }
        
        System.out.println();
        
    
        

        /*
        (b) ler um outro valor inteiro positivo e inclui-lo no vetor se ainda existir
        uma posição livre. O novo valor deve ser inserido na primeira posição
        livre (que tiver -1).
        */  
        System.out.println("Informe um novo numero para ser adicionado ao vetor: ");
        int umTerceiroNum = in.nextInt();

        for(int k = 0; k < tamanho; k++)
        {
            if(lista[k] == -1)
            {
                lista[k] = umTerceiroNum;
            }

            System.out.print(lista[k]);
        }

        System.out.println();

        /*
        (c) ler mais um valor inteiro positivo, uma posição p e substituir o el-
        emento atual da posição p pelo valor lido.
        */

        System.out.println("Informe um número para adicionarmos agora escolhendo sua posicao: ");
        int umQuartoNum = in.nextInt();

        System.out.println("Informe a posição desejada: ");
        int posicao = in.nextInt();

        for(int l = 0; l < tamanho; l++)
        {
            if(l == posicao)
            {
                lista[l] = umQuartoNum;
            }

            System.out.print(lista[l]);
        }

        System.out.println();

        /*
        (d) ler ainda mais um valor p ositivo. O programa informar a p osição do
        valor lido no vetor. 
        */
        System.out.println("Agora vamos descobrir em qual índice está o número que buscamos.");
        System.out.println("Informe um último número: ");
        int ultimoNum = in.nextInt();

        for(int m = 0; m < tamanho; m++)
        {
            if(lista[m] == ultimoNum)
            {
                System.out.printf("Achei! está na posicao %d!\n", m);
            }
        }
        in.close();
    }
}