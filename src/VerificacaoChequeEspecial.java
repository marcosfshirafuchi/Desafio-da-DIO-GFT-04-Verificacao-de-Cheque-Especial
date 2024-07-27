import java.util.Scanner;

public class VerificacaoChequeEspecial {
    /**
     * <h1> Desafio da DIO GFT - Explorando Desafios de Códigos Básicos em Java</h1>
     * Desafio 04 / 05 - Verificação de Cheque Especial
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   27/07/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if(saque <= saldo){
            System.out.println("Transacao realizada com sucesso.");

            // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
        }else{
            double saldoTotal = saldo + limiteChequeEspecial;
            if (saque <= saldoTotal)
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            else
                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");

        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}