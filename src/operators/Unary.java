/**
 * Unários
 * Esses operadores, são aplicados juntamente com outro operador aritmético. Eles realizam alguns trabalhos básicos
 * como incrementar, decrementar, inverter valores numéricos e boolean.
 * (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
 * (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
 * (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
 * (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
 * (!) Operador unário lógico de negação – nega o valor de uma expressão boolean.
 */

package src.operators;

public class Unary {
    public static void main(final String[] args) {
        int number = +5; // ou simplesmente: int number = 5;
        boolean isTrue = true;

        // Imprimindo o número negativo
        System.out.println("Número negativo: " + (-number));

        // Incrementando número em mais 1 (pós-incremento)
        number++; // número agora é 6
        System.out.println("Após number++: " + number);

        // Pós-incremento: imprime primeiro, depois incrementa
        System.out.println("number++ (pós-incremento): " + number++); // imprime 6, depois incrementa
        System.out.println("Valor atual de number: " + number); // agora é 7

        // Pré-incremento: incrementa antes de usar
        System.out.println("++number (pré-incremento): " + ++number); // agora é 8

        // Operador unário lógico
        final boolean verdadeiro = true;
        System.out.println("Inverteu verdadeiro (!verdadeiro): " + !verdadeiro); // false

    }
}
