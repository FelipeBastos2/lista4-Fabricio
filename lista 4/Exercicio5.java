/*Crie um programa em Java que implementa um jogo simples de adivinhação.
O objetivo do jogo é que o usuário tente adivinhar um número secreto gerado aleatoriamente pelo computador. 
Este número estará entre 1 e 100, inclusive. 
Para tornar o jogo interativo e dar feedback ao jogador, o 
programa deve informar após cada tentativa se o palpite do usuário é muito alto, muito baixo, ou correto.
O jogo termina quando o usuário acertar o número, e o programa deve informar o número de tentativas que foram 
necessárias para chegar à resposta correta. Exemplo:

Bem-vindo ao Jogo de Adivinhação!
Estou pensando em um número entre 1 e 100...
Tente adivinhar qual é!
Digite seu palpite: 50
Muito alto. Tente novamente.
Digite seu palpite: 25
Muito baixo. Tente novamente.
Digite seu palpite: 37
Parabéns! Você acertou o número em 3 tentativas!
*/
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);
        int numSorte;
        int tentativa=0;

            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Aguarde enquanto eu penso em um numero de 1 a 100...");
            System.out.println("Pronto! Tente adivinha qual é o numero!!");
            System.out.println("Digite aqui o seu palpite: ");
            numSorte = inicialScanner.nextInt();

            while (numSorte >=1) {
               tentativa++;
                
                if (numSorte > 37 && numSorte<100) {
                 System.out.println("Hmm.. Muito alto. Tente novamente.\n\nDigite aqui o seu palpite:");  
                 numSorte = inicialScanner.nextInt();              
                }
                 
                else if (numSorte < 37 ) {
                System.out.println("Hmm.. Muito baixo. Tente novamente.\n\nDigite aqui o seu palpite:");
                numSorte = inicialScanner.nextInt();
                }
                else if (numSorte>100) {
                    System.out.println("APENAS NÚMEROS DE 1 A 100. SIGA AS REGRAS DO JOGO!\n\nDigite aqui o seu palpite:");
                    numSorte = inicialScanner.nextInt();
                }

                else {
                System.out.println("Parabéns!! Você acertou!" );
                System.out.println("Tentativas:"+tentativa );
                break;
                }
                              
            }
        
            inicialScanner.close();

    }
}
