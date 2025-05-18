/**
 * Ternário
 * O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores.
 * Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua
 * estrutura estará escrita numa única linha.
 * O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
 */

package src.operators;

public class Ternary {
    public static void main(final String[] args) {
        final int a;
        final int b;

        a = 5;
        b = 6;

        final String resultado = (a == b) ? "verdadeiro" : "false";
        System.out.println(resultado);
    }
}
