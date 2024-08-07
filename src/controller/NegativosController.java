package controller;

public class NegativosController {
	public NegativosController() {
		super();
	}
	
	public int contarNegativos(int[] vet, int posi) {
		if (posi < 0) {return 0;}
		//Ponto de Parada é quando a variável da posição fica abaixo da primeira posição do vetor. Retorna 0 para não inferir no resultado da soma.
		else {
			if (vet[posi] < 0) {return 1 + contarNegativos(vet, posi-1);}
			else {return 0 + contarNegativos(vet, posi-1);}
			//Se negativo, soma 1 e segue com a posição anterior, se positivo, soma 0 e segue com a posição anterior.
		}
		
	}
}
