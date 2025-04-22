public class E4 {
    /*
    * Enunciado:
    Implemente um programa que imprima os 10 primeiros números da sequência de Fibonacci utilizando o loop while.
    Requisitos:

    Inicie a sequência com os valores 0 e 1;
    Calcule os próximos termos somando os dois anteriores;
    Imprima cada número da sequência (em linha separada ou separados por vírgula).
    * */

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, count = 0;
        int limite = 10; // Número de termos a serem impressos

        System.out.println("Sequência de Fibonacci:");

        while (count < limite) {
            System.out.println(n1);
            n3 = n1 + n2; // Próximo termo é a soma dos dois anteriores
            n1 = n2; // Atualiza o primeiro número
            n2 = n3; // Atualiza o segundo número
            count++;
        }
    }
}
