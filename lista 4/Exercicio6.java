
/*Modifique o programa do Jogo de Adivinhação para que após cada tentativa,
 o programa deve informar ao usuário se o palpite é muito alto, muito baixo, ou correto. 
 Uma vez que o usuário adivinhe o número corretamente, o programa perguntará se ele gostaria de jogar novamente.
 O usuário pode continuar jogando quantas vezes quiser até que escolha sair do jogo. Dica: use while(true).
*/
import java.util.Random;
import java.util.Scanner;
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);
        Random random = new Random();
    
        int numSorte;
        int tentativa=0;
        int aleatorio =  random.nextInt(100);
        
        

            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Aguarde enquanto eu penso em um numero de 1 a 100...");
            System.out.println("Pronto! Tente adivinha qual é o numero!!");
            System.out.println("Digite aqui o seu palpite: ");
            numSorte = inicialScanner.nextInt();
            
            while (true) {
               tentativa++;
            
                if (numSorte > aleatorio && numSorte<100) {
                 System.out.println("Hmm.. Muito alto. Tente novamente.\n\nDigite aqui o seu palpite:");  
                 numSorte = inicialScanner.nextInt();              
                }
                 
                else if (numSorte>1&&  numSorte<aleatorio ) {
                System.out.println("Hmm.. Muito baixo. Tente novamente.\n\nDigite aqui o seu palpite:");
                numSorte = inicialScanner.nextInt();
                }
                else if (numSorte>100) {
                    System.out.println("APENAS NÚMEROS DE 1 A 100. SIGA AS REGRAS DO JOGO!\n\nDigite aqui o seu palpite:");
                    numSorte = inicialScanner.nextInt();
                }       
                
                else if (numSorte == aleatorio) {
                    System.out.println("Parabéns!! Você acertou!"+"\nTentativas:"+tentativa +"\n Deseja jogar novamente? Se sim digite qualquer numero se nao, digite -1" );
                    numSorte = inicialScanner.nextInt();
                }

                else if (numSorte == -1) {
                    System.out.println("Jogo finalizado!");
                    break;
                }
            
                }
                inicialScanner.close();     
            }
        
       

    }

