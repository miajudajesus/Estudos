/*
Escreva um programa que lê um valor n inteiro e guarde em um vetor os
n primeiros termos da série de bonacci: 1, 1, 2, 3, 5, 8, 13, 21, ... O
programa deve escrever o vetor, ao seu final. 
*/
import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) throws Exception 
    {
        //Escreva um programa que lê um valor n inteiro
        Scanner in = new Scanner(System.in);

        System.out.println("Informe n:");
        int n = in.nextInt();

        //e guarde em um vetor os n primeiros termos da série de bonacci: 1, 1, 2, 3, 5, 8, 13, 21, ...
        int vetor[] = new int[n];
        int anterior = 0;
        int proximo = 1;
        int soma = 0;   

        for(int i = 0; i<= n-1; i++)
        {
            vetor[i] = proximo;
            soma = proximo + anterior;
            anterior = proximo;
            proximo = soma;
            System.out.print("[" + vetor[i] + "]");
        }

        in.close();
    }   
}