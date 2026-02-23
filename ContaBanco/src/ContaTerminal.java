import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá, bem vindo!");
        System.out.println("Dados do cliente: ");
        System.out.print("Número da sua conta: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Agência: ");
        String agencia = teclado.nextLine();
        System.out.print("Nome: ");
        String nomeCliente = teclado.nextLine();
        System.out.print("Saldo: ");
        double saldo = teclado.nextDouble();
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque.");

        teclado.close();
    }
}
