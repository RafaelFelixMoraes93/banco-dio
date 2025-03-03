import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        cliente1.setSaldo(0.0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a Banco Rende Mais");
        System.out.println("O número da conta deve conter apenas (1-9 e deve ser de 6 digitos.)");
        System.out.printf("Digite a conta: ");
        int loop = 0;
        while (loop != 1){
            cliente1.setNumeroDaConta(scanner.nextInt());
            cliente1.contaValida(cliente1.getNumeroDaConta());
            if (cliente1.contaValida(cliente1.getNumeroDaConta())) {
                loop = 1;
            } else {
                System.out.println("Conta inválida.");
            }
        }
        scanner.nextLine();

        System.out.println("O número da agência deve conter 3 dígitos");
        System.out.printf("Digite a agência: ");
        loop = 0;
        while (loop !=1){
            cliente1.setAgencia(scanner.nextLine());
            cliente1.agenciaValida(cliente1.getAgencia());
            if (cliente1.agenciaValida(cliente1.getAgencia())){
                cliente1.setAgencia(cliente1.getAgencia() + "-1");
                loop = 1;
            }else {
                System.out.println("Agência inválida");
            }
        }

        System.out.println("o nome do cliente deve conter apenas caracteres a-z e A-Z");
        System.out.println("Digite o nome do cliente");
        loop = 0;
        while (loop != 1){
            cliente1.setNomeCliente(scanner.nextLine());
            if (cliente1.nomeValido(cliente1.getNomeCliente())){
                cliente1.setNomeCliente(cliente1.formatarNome(cliente1.getNomeCliente()));
                loop = 1;
            }else {
                System.out.println("Nome inválido.");
            }
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo inicial é de R$ %.2f.%n", cliente1.getNomeCliente(), cliente1.getAgencia(), cliente1.getNumeroDaConta(), cliente1.getSaldo());
    }
}
