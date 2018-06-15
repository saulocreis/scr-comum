package scrtc.learn.lambdaexpressions;

import java.util.function.BinaryOperator;

/**
 * ver https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 */
public class Calculadora {

	public static void main(String[] args) {
		
		long num1 = 5;
		long num2 = 3;
		
		BinaryOperator<Long> soma = (n1, n2) -> n1 + n2;
		BinaryOperator<Long> subtracao = (n1, n2) -> n1 - n2;
		BinaryOperator<Long> multiplicacao = (n1, n2) -> n1 * n2;
		
		long resultado1 = soma.apply(num1, num2);
		long resultado2 = subtracao.apply(num1, num2);
		long resultado3 = multiplicacao.apply(num1, num2);
		
		System.out.println("soma: (" + num1 + " ; " + num2 + ") = " + resultado1);
		System.out.println("subtracao: (" + num1 + " ; " + num2 + ") = " + resultado2);
		System.out.println("multiplicacao: (" + num1 + " ; " + num2 + ") = " + resultado3);
	}

}
