import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo=237.48;

    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, insira seu nome !");
    nomeCliente = sc.nextLine();

    System.out.println("Por favor, digite o número da Agência !");
    agencia = sc.nextLine();

    System.out.println("Por favor, insira o número de sua conta !");
    numero = sc.nextInt();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    sc.close();
  }  
}
