/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)

e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:

Distancia = V(x2 - x1)² + (y2 - y1)²

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto 
flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais.
*/
import java.util.*;
public class Bee1015{
    public static void main(String[]args)
    {
    // Leia os quatro valores correspondentes
    // aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1)
    Scanner in = new Scanner (System.in);

    double x1 = in.nextDouble();
    double x2 = in.nextDouble();
    double y1 = in.nextDouble();
    double y2 = in.nextDouble();

    // Calcule e imprima o valor da distância 
    // segundo a fórmula fornecida, considerando 4 casas decimais.
    // V(x2 - x1)² + (y2 - y1)²

    double dist = Math.sqrt(((Math.pow(x2 - x1,2)) + Math.pow(y2 - y1,2)));
    
    System.out.printf("%.4f", dist);

    in.close();
    }

}