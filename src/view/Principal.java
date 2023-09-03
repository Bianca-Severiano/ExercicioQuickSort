package view;

import br.edu.fateczl.ordenacao.quicksort.ControllerQuinckSort;

public class Principal {

	public static void main(String[] args) {
		int vet1[] = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int vet2[] = { 44, 43, 42, 41, 40, 39, 38 };
		int vet3[] = { 31, 32, 33, 34, 99, 98, 97, 96 };
		
		ControllerQuinckSort qs = new ControllerQuinckSort();
		
		qs.quickSort(vet1, 0, vet1.length-1);
		qs.quickSort(vet2, 0, vet2.length-1);
		qs.quickSort(vet3, 0, vet3.length-1);
		
		
		System.out.println("Vetor 1:");
		for (int i : vet1) {
			System.out.print(i + " ");
		}
		
		
		System.out.println("\nVetor 2:");
		for (int i : vet2) {
			System.out.print(i + " ");
		}
		
		
		System.out.println("\nVetor 3:");
		for (int i : vet3) {
			System.out.print(i + " ");
		}


	}

}
