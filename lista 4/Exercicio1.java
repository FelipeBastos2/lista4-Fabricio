/*Crie um programa que lê vários números inteiros e positivos e imprima
 o produto dos números ímpares e a soma dos números pares. */
 
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int produtoImpares = 1;
        int somaPares = 0;

        System.out.println("Digite vários números inteiros e positivos. Digite um número negativo para parar.");

        int numero = scanner.nextInt();

        while (numero >= 0) {
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                produtoImpares *= numero;
            }

            System.out.println("Digite outro número ou um número negativo para parar:");
            numero = scanner.nextInt();
        }

        System.out.println("Produto dos números ímpares: " + produtoImpares);
        System.out.println("Soma dos números pares: " + somaPares);

        scanner.close();
    }
}

        

