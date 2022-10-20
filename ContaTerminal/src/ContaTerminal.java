import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        String sobrenomeCliente;
        float saldo;

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta!");
        numero = scan.nextInt();
        System.out.println("Numero da conta: " + numero);

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.next();
        System.out.println("Agencia da conta: " + agencia);

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scan.next();
        System.out.println("Por favor, digite o sobrenome do cliente!");
        sobrenomeCliente = scan.next();
        System.out.println("Nome completo: " + nomeCliente + " " + sobrenomeCliente);

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scan.nextFloat();
        System.out.println("Saldo: " + saldo);

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
    }
}
