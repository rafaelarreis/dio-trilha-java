import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe scanner
       //Exibir as mensagens para o nosso usuario
       //Obter pela scanner os valores digitados no terminal
       //Exibir a mensagem da conta criada
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite o número da conta");
       int numero = scanner.nextInt();

       System.out.println("Digite a agência: ");
       String agencia = scanner.next();

       System.out.println("Digite seu nome completo: ");
       String nome = scanner.next();

       System.out.println("Digite seu saldo: ");
       double saldo = scanner.nextDouble();

       //imprimindo os dados obtidos pelo usuario
       System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco");
       System.out.println("sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível!");
    }
}
