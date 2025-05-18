package src.documentation;

/**
 * Calculadora Simples
 *
 * @author João Batsita
 */
public class Calculate {
    /**
     * Realiza a divisão entre dois números inteiros
     *
     * @param dividend     Número que será dividido
     * @param divisor       Número que irá dividir o dividendo
     * @return              O resultado da divisão entre o dividendo e o divisor
     * @author              Gleyson Sampaio
     * @exception 	        java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
     */
    Integer divide(final Integer dividend, final Integer divisor) {
        return dividend / divisor;
    }
}