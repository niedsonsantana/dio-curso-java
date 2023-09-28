import java.util.*;

public class ContaTerminal {

    static Scanner sc = new Scanner(System.in);
    static List<ContaBancaria> contaBancariaList = new ArrayList<>();

    public static void main(String[] args) {

        boolean repetir = true;
        while (repetir){
            System.out.println("1- Criar conta\n2- Consultar conta\n3- Sair");
            int operacao = sc.nextInt();
            switch (operacao) {
                case 1 -> criar();
                case 2 -> consultar();
                case 3 -> repetir = false;
                default -> System.out.println("Opção inválida");
            }
        }

    }

    private static void consultar() {
        System.out.println("Digite o número da conta");
        String numeroConta = sc.next();
        System.out.println( contaBancariaList
                .stream()
                .filter(contaBancaria -> contaBancaria.getNumeroConta().equals(numeroConta))
                .findFirst()
                .orElse(null));

    }

    private static void criar() {
        System.out.println("Número da conta");
        String numero = sc.next();
        System.out.println("Nome");
        String nome = sc.next();

        System.out.println("Criar conta:\nQual tipo de conta?\n1- Especial\n2- Poupanca");
        int opcao = sc.nextInt();
        if (opcao==1){
            ContaBancaria conta = new ContaEspecial(nome,numero,0,0);
            contaBancariaList.add(conta);
        } else if (opcao == 2){
            ContaBancaria conta = new ContaPoupanca(nome, numero,0,0);
            contaBancariaList.add(conta);
        }else {
            System.out.println("Opção inválida");
        }
    }
}
