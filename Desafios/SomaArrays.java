package Desafios;
import java.util.*;
public class SomaArrays
{
    public static void main(String[]args)
    {
        int arrayA[] = new int[]{1,2,3,4,5,6};
        int arrayB[] = new int[]{1,2,3,4,5};
        
        int tamanhoA = arrayA.length;
        int tamanhoB = arrayB.length;
        int arraySoma[] = new int[tamanhoA];

        for(int i = 0; i < tamanhoA; i++)
        {
            for(int j = 0; j < tamanhoB; j++)// esse for interno é desnecessário, somente utilizar 1
            {
                arraySoma[j] = arrayA[j] + arrayB[j];                
            }
            arraySoma[tamanhoA-1] = arrayA[i]; 
            System.out.print(arraySoma[i]);
        }
    }
}