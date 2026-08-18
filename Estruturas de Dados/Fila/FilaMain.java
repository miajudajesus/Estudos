package Fila;

public class FilaMain {
    public static void main(String[]args)
    {
        Fila fila = new Fila();

        int [] array = new int[5];

        fila.enfileira(1, array);
        fila.enfileira(11, array);
        fila.enfileira(111, array);
        

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        System.out.println("=============================");

        fila.desenfileira(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
