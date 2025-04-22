public class E2 {
    /*
    * Desenvolva um programa que solicite números ao usuário e some-os enquanto os números fornecidos forem positivos.
        Requisitos:
        - Utilizar um while que continue a iterar enquanto o número informado for positivo;
        - Ao receber um número negativo, encerrar o loop e exibir o total acumulado dos números positivos.
    * */

    public static void main(String[] args) {
        // Como a classe Scanner foi declarada no momento de criar o objeto, não é necessário importar a classe Scanner de forma explicita.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int soma = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                soma += numero;
            }
        }

        System.out.println("Soma dos números positivos: " + soma);
    }
}
