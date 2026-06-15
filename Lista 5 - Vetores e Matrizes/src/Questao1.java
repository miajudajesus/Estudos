/*
Faça um programa que leia um vetor A com 10 valores inteiros, todos
positivos. A seguir, o programa deve escrever:
(a) os valores impares de A.
(b) os valores das posições impares de A.
(c) os valores impares de A que estão em posições pares.
(d) o vetor A na ordem inversa.
*/

public class Questao1 {
    public static void main(String[] args) throws Exception {

    // Faça um programa que leia um vetor A com 10 valores inteiros, todos positivos.
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < A.length; i++)
        {
            // (a) os valores impares de A.
            if (A[i] % 2 > 0)
            {
                //System.out.println("Valor ímpar encontrado: " + A[i] );
            }
        }
        
        for(int i = 0; i < A.length; i++)
        {
            // (b) os valores das posições impares de A.
            if(i % 2 > 0)
            {
                //System.out.println("Valores das posições impares: " + A[i] + " ");
            }
        }
            
        for(int i = 0; i < A.length; i++)
        {
            // (c) os valores impares de A que estão em posições pares.
            if (A[i] % 2 > 0 && i % 2 == 0)
            {
                //System.out.println("Valores impares de A que estão em posições pares: " + A[i] + " ");
            }
        }

        for(int i = A.length -1; i >= 0; i--)
        {
            // (d) o vetor A na ordem inversa.
            //System.out.print("[" + A[i] + "]");

        }

    }
}
