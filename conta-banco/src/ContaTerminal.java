import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome !");
        String nome = sc.next();

        System.out.println("Por favor, digite o número da agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da sua conta !");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o valor do seu saldo !");
        double saldo = sc.nextDouble();
        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
