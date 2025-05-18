/**
 * Atribuição
 * Representado pelo símbolo de igualdade =.
 * O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.
 * Em Java, definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição.
 */

package src.operators;

import java.util.Date;

public class Assignments {
    public static void main(final String[] args) {
        String name = "João Batista";
        int years = 28;
        double peso = 68.5;
        boolean scholar = true;
        final Date dateBirth = new Date();

        // Operadores de atribuição compostos
        years += 2;         // Adiciona 2 anos
        peso -= 1.5;        // Subtrai 1.5 kg
        name += " da Silva"; // Concatena sobrenome
        scholar = false; // Inverte o valor boolean

        // Exibir os valores atualizados
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + years);
        System.out.println("Peso: " + peso);
        System.out.println("Bolsista: " + scholar);
        System.out.println("Data de nascimento: " + dateBirth);
    }
}
