public class E5 {
    /*
    * Crie um programa que solicite ao usuário um número entre 1 e 100.
    Requisitos:
    Utilize um loop do..while para garantir que o valor informado esteja dentro do intervalo;
    Exibir o número validado após a saída do loop.
    * */

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 100: ");
            numero = scanner.nextInt();
            if (numero < 1 || numero > 100) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (numero < 1 || numero > 100);

        System.out.println("Número validado: " + numero);
    }
}
