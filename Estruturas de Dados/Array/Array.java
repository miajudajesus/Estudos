package Array;
public class Array
{
    public static void main (String [] args)
    {
        int [] array = new int [5];

        // populando um array via índice
        array[0] = 3;
        array[4] = 8;

        // removendo um valor de um determinado índice
        array[0] = -1;
        array[4] = -1;

        // visualizando o array atualizado
        for(int h = 0; h < array.length; h++)
        {
            System.out.print(array[h] + " ");
        }
        System.out.println(" ");
        
        // adicionando valores em um array usando loops
        for (int i = 0;  i < array.length; i++)
        {
            array[i] = 184 + i % 12;
        }

        // imprimindo o array
        for (int j = 0; j < array.length; j++)
        {
            System.out.print(array[j] + " ");
        }

    } 
}