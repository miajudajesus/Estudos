/*
Elabore um programa que leia um vetor de 6 valores reais e o escreva. A
seguir, o programa dever trocar o elemento da posição i pelo da posição
i + 2 e escrever novamente o vetor. 
*/
import java.util.*;
public class Questao20
{
    public static void main(String [] args)
    {   
        //Elabore um programa que leia um vetor de 6 valores reais e o escreva.
        Scanner in = new Scanner(System.in);

        double vetor [] = new double [6];
        int tamanho = vetor.length;
        double valores = 0.0;
        int proximo = 0;

        for(int i = 0; i < tamanho; i++)
        {
            System.out.printf("Informe o valor para a posicao %d: ", i);
            valores = in.nextDouble();

            vetor[i] = valores;
        }

        System.out.print("[");

        for(double valor: vetor)
        {
            System.out.print(" " + valor);
        }

        System.out.println("]");


        System.out.print("[");

        for(int k = 0; k < tamanho; k++)
        {
            proximo = k + 2;
            
            if(proximo < tamanho)
            {
                vetor[k] = vetor[proximo];
            }
            else if(proximo >= tamanho)
            {
                vetor[k] = -1.0;
            }

            System.out.print(" " + vetor[k]);
            
        }
        System.out.print("]");

        in.close();

    }
}