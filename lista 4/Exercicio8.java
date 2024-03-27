/*Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro),
ou seja, A*B, por intermédio de adições sucessivas. 
 Tanto A quanto B devem ser fornecidos pela pessoa utilizadora do programa.
*/

import java.util.Scanner;

public class Exercicio8 {
        public static void main(String[] args) {
                
        Scanner iniciScanner = new Scanner(System.in);

        System.out.println("Digite o número real (A):");
        double A = iniciScanner.nextDouble();

        System.out.println("Digite o número inteiro (B):");
        int B = iniciScanner.nextInt();

        double valor = calcularProduto(A, B);

        System.out.println("O produto de " + A + " por " + B + " é igual a: " + valor);


      iniciScanner.close();        
           
        }
        public static double calcularProduto(double A, int B) {
            double produto = 0;

            for (int i = 0; i < Math.abs(B); i++) {
                produto += A;
            }
    
            if (B < 0) {
                produto = -produto;
            }
    
            return produto;
}
}
