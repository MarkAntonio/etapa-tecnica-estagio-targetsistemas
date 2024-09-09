package com.targetsistemas.etapatecnica.questao1;

public class App {
	/*
	 * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
	 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
	 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência 
	 * de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser 
previamente definido no código;
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		int entrada = 21;
		boolean pertence = false;
		String sequenciaFibo = "";
		if (entrada == 1) {
			sequenciaFibo = "0";
			pertence = true;
		}
		else if (entrada == 2) {
			sequenciaFibo = "0, 1";
		}
		
		else if (entrada > 2){
			sequenciaFibo = "0, 1";
			int nTermos, anterior, atual, auxiliar;
			nTermos = entrada - 2;
			anterior = 0;
			atual = 1;
			
			for (int i = 1; i<= nTermos; i++) {
				auxiliar = anterior;
				anterior = atual;
				atual += auxiliar;
				if (atual == entrada) pertence = true;
				sequenciaFibo += ", " + atual;
			}
			
			
		}
		System.out.println(sequenciaFibo);
		
		if (pertence)
			System.out.printf("O número %d pertence à sequencia!", entrada);
		else
			System.out.printf("O número %d NÃO pertence à sequencia!", entrada);
	}
}
