package Desafios;

// Uma palavra palíndromo é aquela que é igual lendo da esquerda para a direita ou da direita para a esquerda.
// Para esse teste, farei um verificador de palavra palíndromo utilizando two pointers.
// PRIMEIRA TENTATIVA: 1H15 PARA FAZER
// SEGUNDA TENTATIVA: 

import java.util.*;
public class Palindromo
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe a palavra a ser testada: ");
        String palavra = in.nextLine();
        
        int tamanho = palavra.length();  
        int esquerda = 0;
        int direita = tamanho-1;
        boolean palindromo = false;

        for(int i = 0; i < tamanho; i++)// não é necessario o for, usar while
        {
            if (palavra.charAt(esquerda) == palavra.charAt(direita) && esquerda < direita)
                {
                    esquerda = esquerda + 1;
                    direita = direita - 1;
                }
            if(tamanho % 2 != 0)// NÃO SERÁ NECESSÁRIO VERIFICAR O TAMANHO DA PALAVRA USANDO WHILE
            {
                // palindromo de tamanho impar
                if(palavra.charAt(esquerda) == palavra.charAt(direita) && esquerda == direita)
                {
                    palindromo = true;
                }
            }

            // palindromo de tamanho par
            if(tamanho % 2 == 0)// NÃO SERÁ NECESSÁRIO VERIFICAR O TAMANHO DA PALAVRA USANDO WHILE
            {
                if(palavra.charAt(esquerda) == palavra.charAt(direita) && esquerda == (tamanho/2))
                {
                    palindromo = true;
                }
            }
        }

        if(palindromo == true)
        {
            System.out.println("É palindromo!");
        }
        else
        {
            System.out.println("Nao é palindromo!");
        }

        in.close();
    }

}