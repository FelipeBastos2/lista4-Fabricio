/*Escreva um programa que: 
leia 100 fichas, onde cada ficha contém o número de matrícula e a nota de cada aluno de um determinado curso;
determine e imprima as duas maiores notas, juntamente com o número de matrícula do aluno que obteve cada uma delas; 
assuma que não exista dois ou mais alunos com a mesma nota;
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

        int matricula1=0;
        double nota1 = Double.MIN_VALUE;
        double nota2 = Double.MIN_VALUE;
        int matricula2 =0;

        for(int i=0; i < 101;i++){
            System.out.println("Ficha do aluno"+i+":");
            System.out.println("Matricula:");
            int matricula = inicialScanner.nextInt();
            System.out.println("Nota: ");
            double nota = inicialScanner.nextDouble();
        }



        inicialScanner.close();
    }
}
