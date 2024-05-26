import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número de sua agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número de sua conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo");
        float saldo = scanner.nextFloat();
        
        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá" + " " + nomeCliente + "," + " " + "obrigado por criar uma conta em nosso banco, sua agência é" + " " + agencia + "," + " " + "conta" + " " + numero + " " + "e seu saldo" + " " + saldo + " " + "já está disponível para saque.");
        
    }
}