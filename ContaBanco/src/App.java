import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        var numero = ler.nextInt();

        System.out.println("Digite o número da agência: ");
        var agencia = ler.next();

        System.out.println("Digite o nome do cliente: ");
        var nomeCliente = ler.next();

        System.out.println("Digite o saldo: ");
        double saldo = ler.nextDouble();

        var conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

    }
}
