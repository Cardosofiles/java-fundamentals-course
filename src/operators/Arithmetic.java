/**
 * Aritméticos
 * O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou
 * não uma expressão mais complexa.
 * Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação), / (divisão) e % (módulo).
 */

package src.operators;

public class Arithmetic {
    public static void main(final String[] args) {
        // Declaração de variáveis
        final int a = 10;
        final int b = 3;

        // Operações Aritméticas
        final int sum = a + b;          // Adição
        final int subtract = a - b;     // Subtração
        final int multiplication = a * b; // Multiplicação
        final int division = a / b;       // Divisão inteira
        final int rest = a % b;         // Módulo (resto da divisão)

        // Resultado com ponto flutuante
        final double royalDivision = (double) a / b;

        // Exibição dos resultados
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + subtract);
        System.out.println("Multiplicação: " + multiplication);
        System.out.println("Divisão inteira: " + division);
        System.out.println("Resto da divisão: " + rest);
        System.out.println("Divisão com ponto flutuante: " + royalDivision);
    }
}
