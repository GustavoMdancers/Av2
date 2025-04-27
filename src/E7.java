public class E7 {
    /*
    *
    Crie um jogo onde o programa seleciona aleatoriamente um número entre 1 e 20 e o usuário deve adivinhá-lo.
    Requisitos:

    - Utilize um loop do..while para repetir as tentativas;
    - Para cada palpite, informe se o número digitado é maior ou menor que o valor sorteado;
    - Ao acerto, exiba uma mensagem de congratulações com a quantidade de tentativas realizadas.
    * */

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numeroSorteado = (int) (Math.random() * 20) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 20.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número é maior que " + palpite + ".");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número é menor que " + palpite + ".");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSorteado);

        scanner.close();
    }
}
