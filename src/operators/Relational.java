/**
 * Relacionais
 * Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões.
 * Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior,
 * maior ou igual ao da direita, retornando um valor boolean como resultado.
 */

package src.operators;

public class Relational {
    public static void main(final String[] args) {
        final int numberOne = 1;
        final int numberTwo = 2;

        if (numberOne > numberTwo) {
            System.out.println("Número 1 é maior que número 2");
        }

        if (numberOne < numberTwo) {
            System.out.println("Número 1 é menor que número 2");
        }

        if (numberOne >= numberTwo) {
            System.out.println("Número 1 é maior ou igual a número 2");
        }

        if (numberOne <= numberTwo) {
            System.out.println("Número 1 é menor ou igual a número 2");
        }

        if (numberOne != numberTwo) {
            System.out.println("Número 1 é diferente de número 2");
        }
    }
}