import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("\"Por favor, digite o número da Agência !\"");
        int agencia =  terminal.nextInt();
        System.out.println("\"Por favor, digite o número da sua conta !\"");
        String contaCorrente =  terminal.next();
        System.out.println("\"Por favor, digite seu nome completo !\"");
        String nomeCliente =  terminal.next();
        System.out.println("\"Por favor, digite o valor do depósito !\"");
        double valorDeposito = terminal.nextDouble();
        System.out.println();
        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +  agencia + ", conta " + contaCorrente +  " e seu saldo " + valorDeposito + " já está disponível para saque.\"");
        System.out.println();

    }
}
