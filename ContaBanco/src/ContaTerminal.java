import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem-vindo");
        System.out.println("Digite o número da conta sem o dígito verificador: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agencia: ");
        String agencia = scanner.next();

        scanner.nextLine();  //Aqui eu emplementei esse consmo de caractere, devido o espaço no nome do cliente.

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        // Impressão dos dados no terminal

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para uso!");

    }

}
