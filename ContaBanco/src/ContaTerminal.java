import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor digite o numero da agencia (Com o - inlcuido): ");
        agencia = scanner.next();
        System.out.print("\nPor favor digite o numero da conta: ");
        numero = scanner.nextInt();
        System.out.print("\nPor favor digite seu nome completo: ");
        nomeCliente = scanner.next();
        System.out.print("\nPor favor digite o valor que queira depositar: $");
        saldo = scanner.nextDouble();

        String msg;
        msg = "Olá " + nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$" + saldo + " já está disponível para saque";
        System.out.println(msg);

        scanner.close();


    }
}
