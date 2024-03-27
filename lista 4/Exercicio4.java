/* Em um campeonato de LOL, enquanto não há a tomada de território,
 o contador implementado deve contar (que é contabilizado pelo jogo), o número de kills, deaths e assists. 
Se o número de kills for menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais “master”. 
Se o número de deaths chegar a 20 ou mais,  ele mostra a mensagem “Houston, we have a problem”.
 Se o número de assists chegar a 20 ou mais, é mostrada a mensagem: “team work”. 
Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
Dicas: 


há kills, deaths e assists total e da rodada
medite na frase: enquanto não há um vencedor, faça…
pergunte a cada loop o número de cada medida comentada.
você deve perguntar se há um vencedor a cada loop…
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);
        int kills=0;
        int deaths=0;
        int assists =0;

            System.out.println("Digite 1+ para iniciar a partida. Digite 0 para finalizar a partida.");
            int partida = inicialScanner.nextInt();
        while(partida > 0) {
            System.out.println("Kills:");
            kills = inicialScanner.nextInt();
              
            if (kills <= 5) {
                System.out.println("Bronze");
           
            }
            if (kills >= 20) {
                System.out.println("Faker?");
            
            }

            System.out.println("Deaths:");
            deaths = inicialScanner.nextInt();

            if (deaths >=20) {
                System.out.println("Toma gap");
                
            }
            System.out.println("Assists:");
            assists = inicialScanner.nextInt();

            if (assists >= 20) {
                System.out.println("Soraka god");
                System.out.println("Há um vencedor?Digite 0 para confirmar e 1 para continuar.");
                partida = inicialScanner.nextInt();
            }
        }

        inicialScanner.close();
    }
    
}
