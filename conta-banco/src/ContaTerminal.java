import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int    NumeroDaConta ;
        String Agencia 	;
        String NomeDoCliente ; 	
        double  Saldo ;

        String MensagemBase = "Por favor, digite ";

        System.out.println(MensagemBase + "o número da Agência !");
        Agencia = scanner.next();

        System.out.println(MensagemBase + "o número da Conta !");
        NumeroDaConta = scanner.nextInt();

        System.out.println(MensagemBase + "o Nome do Cliente !");
        NomeDoCliente = scanner.next();

        System.out.println(MensagemBase + "o Saldo Da Conta !");
        Saldo = scanner.nextDouble();

        System.out.println("Olá "+ NomeDoCliente + ", "+
        "obrigado por criar uma conta em nosso banco, "+
        "sua agência é "+ Agencia + ", "+
        "conta "+ NumeroDaConta + " "+
        "e seu saldo "+ String.format("%.2f", Saldo) + " já está disponível para saque");


    }
}
