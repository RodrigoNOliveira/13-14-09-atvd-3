import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int idade, atual, x, nascimento;
    /*Faça um programa que calcula o ano de nascimento de uma pessoa a partir de sua idade e do ano atual.*/


        System.out.println();
        System.out.println("Calculo de ano de nascimento");
        System.out.println();
        System.out.print("Digite o ano atual: ");
        atual = scanner.nextInt();
        System.out.println();
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.println();
        System.out.print("Digite: \n\n1- sim \n2- nao \n\nVocê ja fez aniversario esse ano? ");
        x = scanner.nextInt();
        System.out.println();
        if (x ==2){
            nascimento = atual - idade -1;
            System.out.println("Seu ano de nascimento é: "+ nascimento);
        }
        else {
            nascimento = atual - idade;
            System.out.println("Seu ano de nascimento é: "+ nascimento);
        }
        System.out.println();
       
      

        scanner.close();
    }
}
