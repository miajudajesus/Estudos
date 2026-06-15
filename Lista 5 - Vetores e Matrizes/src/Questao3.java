/*
Implemente um programa que leia dois valores inteiros e positivos: a e b.
A seguir, o programa deve preencher um vetor com os valores pares entre
a e b. Escreva o vetor criado.
*/
import java.util.*;
public class Questao3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //Implemente um programa que leia dois valores inteiros e positivos: a e b.
        System.out.println("Informe A: ");
        int a = in.nextInt();
        System.out.println("Informe B: ");
        int b = in.nextInt();

        //o programa deve preencher um vetor com os valores pares entre a e b.
        int contadorDePares = 0;
        int indice = 0;


        //descobrindo a quantidade de pares para criar o array
        for (int i = a; i <= b; i++)
        {
            if(i % 2 == 0)
            {
                contadorDePares = contadorDePares + 1;
            }
        }
        
        //criando o array e preenchendo com os numeros pares
        int vetor[] = new int[contadorDePares];

        for(int j = a; j <= b; j++)
        {
            if(j % 2 == 0)
            {
                vetor[indice] = j;
                System.out.print("["+ vetor[indice] + "]");
                indice = indice + 1;
            }
        }

        in.close();
    }
}
