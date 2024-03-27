/*Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
a) a quantidade de pessoas com idade superior a 50 anos;
b) a média das alturas das pessoas com idade entre 10 e 20 anos;
c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
 */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    Scanner inicialScanner = new Scanner(System.in);

        int totalpessoa = 10;
        int idade50 = 0;
        int idade1020= 0;
        double alturasoma = 0;
        int peso40 =0;
        
        for(int i = 0; i <totalpessoa; i++){
            System.out.println("IDADE "+ (i+1)+":");
            int idade = inicialScanner.nextInt();
        

            System.out.println("ALTURA "+ (i+1) +":");
            double altura = inicialScanner.nextDouble();

            System.out.println("PESO "+ (i+1)+":");
            int peso=inicialScanner.nextInt();

            if (idade> 50 ) {
                idade50++;
            }

            if (idade >10 && idade <20) {
                idade1020++;
                alturasoma += altura;
            }
            if (peso < 40) {
                peso40++;
            }

        }
        System.out.println("Pessoas superios a 50 anos de idade: "+idade50);

        System.out.println("Média da altura: "+alturasoma/10);

        System.out.println("Pessoas com peso abaixo de 40Kg: "+peso40+"%");

        inicialScanner.close();
    }
    
}
