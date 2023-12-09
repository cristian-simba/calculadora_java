package com.krakedev;

public class TestCalculadora {
	public static void main(String[] args) {
		Calculadora calcu = new Calculadora();
		double resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		
		resultadoSuma = calcu.sumar(10, 7);
		resultadoResta = calcu.restar(1, 2);
		resultadoMultiplicar = calcu.multiplicar(12, 2);
		resultadoDividir = calcu.dividir(120, 54);
		resultadoPromediar = calcu.promediar(10, 5, 2);
		
		
		System.out.println("El resultado de la suma es: " + resultadoSuma);
		System.out.println("El resultado de la resta es: " + resultadoResta);
		System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicar);
		System.out.println("El resultado de la division es: " + resultadoDividir);
		System.out.println("El resultado del promedio es: " + resultadoPromediar);
		calcu.mostrarResultado();
	}
}
