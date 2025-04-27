public class E6 {
    /*
    * Desenvolva um programa que apresente ao usuário um menu com as seguintes opções:
    Adicionar
    Remover
    Sair
    Requisitos:
    - Use um loop do...while para permitir que o usuário escolha uma opção;
    - Para as opções 1 e 2, exiba uma mensagem indicando que a ação foi executada (a implementação da funcionalidade pode ser simulada);
    - Encerrar o loop somente quando a opção 3 (Sair) for escolhida.
    * */

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner (System.in);
        int opcao;

        System.out.println("Menu:");
        System.out.println("1. Adicionar");
        System.out.println("2. Remover");
        System.out.println("3. Sair");

        do {
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionar ação executada.");
                    break;
                case 2:
                    System.out.println("Remover ação executada.");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        scanner.close();
    }
}
