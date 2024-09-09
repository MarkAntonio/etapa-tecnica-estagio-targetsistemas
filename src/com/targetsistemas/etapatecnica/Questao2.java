package com.targetsistemas.etapatecnica;

public class Questao2 {
	/*
	 * Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
	 *  além de informar a quantidade de vezes em que ela ocorre.

		IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser 
		previamente definida no código;

	 * 
	 * */
	
	public static void main(String[] args) {
		String entrada = "A tecnologia tem o poder de transformar o mundo, "
				+ "mas é o uso consciente que define se essa transformação será para o bem.";
		
		String entradaTratamento = entrada.replace('â', 'a').replace('ã', 'a').replace('à', 'a').replace('á', 'a').toUpperCase();
		
		int count = 0;
		char contarLetra = 'A';
		for (char letra: entradaTratamento.toCharArray()) {
			if (letra == contarLetra)
				++count;
		}
		
		System.out.printf("Essa frase tem %d letra(s) \"A\" ", count);
		
		
	}
}
