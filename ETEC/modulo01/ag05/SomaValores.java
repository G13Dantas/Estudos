import java.util.Scanner;

public class SomaValores {
    public static void main(String args []) {

        int numero1, numero2 , soma;

        Scanner leitor = new Scanner(System.in);

        //descrição programa
        System.out.println("Programa para somar dois valores");
        
        //entrada de dados
        System.out.println("Digite o primeiro valor: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        numero2 = leitor.nextInt();

        //processamento de dados
        soma = numero1 + numero2;

        //saida de dados
        System.out.println("A soma dos valores é: " + soma);
        
        // fecha o scanner para evitar vazamento de recurso
        leitor.close();

    }
    
}