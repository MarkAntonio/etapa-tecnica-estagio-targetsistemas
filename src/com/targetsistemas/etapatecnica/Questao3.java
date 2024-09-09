package com.targetsistemas.etapatecnica;

public class Questao3 {
	/*
	 * 3) Observe o trecho de código abaixo: 
	 * 
	 * int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

		Ao final do processamento, qual será o valor da variável SOMA?
	 * */
	
	public static void main(String[] args) {
		int INDICE = 12, SOMA = 0, K = 1;
		
		while(K < INDICE) {
			K = K + 1;
			SOMA = SOMA + K;
		}
		
		System.out.println("A valor da variável soma é " + SOMA);
	}
}
