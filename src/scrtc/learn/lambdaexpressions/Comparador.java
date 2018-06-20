package scrtc.learn.lambdaexpressions;

import java.util.function.Predicate;

/**
 * https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 */
public class Comparador {

	public static void main(String[] args) {
		
		Predicate<Long> positivo = (p -> p > 0);
		Predicate<Long> zero = (p -> p == 0);
		Predicate<Long> negativo = (p -> p < 0);
		Predicate<Long> par = (p -> p % 2 == 0);
		Predicate<Long> impar = par.negate();
		
		long num1 = 0;
		long num2 = -3;
		
		boolean resultado1 = positivo.or(zero).test(num1);
		boolean resultado2 = negativo.or(zero).test(num2);
		boolean resultado3 = impar.test(num1);
		boolean resultado4 = impar.test(num2);
		
		System.out.println("positivo.or(zero): (" + num1 + ") = " + resultado1);
		System.out.println("negativo.or(zero): (" + num2 + ") = " + resultado2);
		System.out.println("impar: (" + num1 + ") = " + resultado3);
		System.out.println("impar: (" + num2 + ") = " + resultado4);
	}

}
