package desafio;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.nextInt()));
		sc.close();
	}
	
	public static int solution(int N) {
		Integer num = N;// converte em Integer
		String numeroString = num.toString();// converte em string
		char[] vetorCharacter = numeroString.toCharArray();// converte em vetor
		List<Integer> numeros = new ArrayList<Integer>();// cria lista

		for (Character c : vetorCharacter) {
			numeros.add(Integer.parseInt(String.valueOf(c)));// add elementos na lista
		}

		Collections.sort(numeros);// ordena
		Collections.reverse(numeros);// reverte
		String colada = numeros.toString().replaceAll("[^0-9]", "");// concatena
		int retorno = Integer.parseInt(String.valueOf(colada));// converte em inteiro

		if (retorno < 11 || retorno > 100000000) {
			return -1;
		}
		return retorno;
	}
}