/*Crie um programa em Java que exiba formas geométricas na tela. Um menu deve ser exibido com as seguintes opções: 
retângulo, diagonal superior esquerda, diagonal superior direita, diagonal inferior esquerda, diagonal inferior direita. 
As imagens devem ser formadas por asteriscos (*) e, a pessoa utilizadora deve informar a quantidade de colunas. 
Abaixo estão alguns exemplos das formas:

*  *  *  * 
*  *  *  *
*  *  *  *
*  *  *  *

*  *  *  * 
*  *  *  
*  *  
*  

*  *  *  * 
   *  *  *
      *   *
          *
*   
*  * 
*  *  *  
*  *  *  *

          * 
       *  *
    *  *  *
*  *  *  *
 */


import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Retângulo");
        System.out.println("2. Triangulo superior esquerda");
        System.out.println("3. Triangulo superior direita");
        System.out.println("4. Triangulo inferior esquerda");
        System.out.println("5. Triangulo inferior direita");
        int opcao = scanner.nextInt();

        System.out.println("Digite o número de colunas:");
        int colunas = scanner.nextInt();

        switch (opcao) {
            case 1:
                Retangulo(colunas);
                break;
            case 2:
                SuperiorEsquerda(colunas);
                break;
            case 3:
                SuperiorDireita(colunas);
                break;
            case 4:
                InferiorEsquerda(colunas);
                break;
            case 5:
                InferiorDireita(colunas);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static void Retangulo(int colunas) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void SuperiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void SuperiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= colunas - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void InferiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void InferiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= colunas - i - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}