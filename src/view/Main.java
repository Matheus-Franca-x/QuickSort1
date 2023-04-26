package view;

import controller.Ordenacao;

public class Main {

	public static void main(String[] args) 
	{
		
		int[] vetor = {89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75};
		
		Ordenacao ordena = new Ordenacao();
		
		vetor = ordena.quickSort(vetor, 0, vetor.length -1);
		
		for (int valor : vetor)
		{
			System.out.println(valor);
		}
		
		
	}

}
