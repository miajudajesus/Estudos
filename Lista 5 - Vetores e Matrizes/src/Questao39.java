/*
Faça um programa que leia duas matrizes A(2,3) e B(3,2) e escreva uma
matriz C que seja o produto matricial de A p or B. 
*/

import java.util.*;

public class Questao39
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        int linhas = 2;
        int colunas = 3;

        int lin = 3;
        int col = 2;

        int valoresMatriz1 = 0;
        int valoresMatriz2 = 0;

        // Faça um programa que leia duas matrizes A(2,3) e B(3,2)
        int matriz1[][] = new int [linhas][colunas];
        int matriz2[][] = new int [lin][col];
        

        // preenchendo a matriz 1.
        for(int i = 0; i < linhas; i++) //percorre a linha
        {
            for(int j = 0; j < colunas; j++) //percorre a coluna
            {
                System.out.println("informe um valor para preencher a matriz: ");
                valoresMatriz1 = in.nextInt();

                matriz1[i][j] = valoresMatriz1;
            }
        }

        for(int i = 0; i < linhas; i++) //percorre a linha
        {
            for(int j = 0; j < colunas; j++) //percorre a coluna
            {
                System.out.print(matriz1[i][j]);
            }
            System.out.println("");
        }

        System.out.println("=======================================");

        // preenchendo a matriz 2.
        for(int k = 0; k < lin; k++) //percorre a linha
        {
            for(int l = 0; l < col; l++) //percorre a coluna
            {
                System.out.println("informe um valor para preencher a segunda matriz: ");
                valoresMatriz2 = in.nextInt();

                matriz2[k][l] = valoresMatriz2;
            }
        }

        for(int k = 0; k < lin; k++) //percorre a linha
        {
            for(int l = 0; l < col; l++) //percorre a coluna
            {
                System.out.print(matriz2[k][l]);
            }
            System.out.println("");
        }

    }

}