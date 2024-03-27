/*Faça um programa que leia um número indeterminado de valores e mostre o valor lido, 
seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada com valor negativo ou zero.
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

        double numeroIndeterminado;
        
        while (true) {
            System.out.println("Digite um numero:");
             numeroIndeterminado = inicialScanner.nextDouble();

                if (numeroIndeterminado == 0) {
                    System.out.println("Numero invalido.");
                    break;
                    }
                    else {
                        double valorQuadrado = numeroIndeterminado * numeroIndeterminado;
                        double valorCubo = numeroIndeterminado * numeroIndeterminado*numeroIndeterminado;
                        double valorRaiz = Math.sqrt(numeroIndeterminado);

                        System.out.println("Valor do quadrado:"+ valorQuadrado);

                        System.out.println("Valor do cubo:"+valorCubo);

                        System.out.println("Valor da raiz:"+valorRaiz);
                        
                    }

        inicialScanner.close();

    }

    }

}
