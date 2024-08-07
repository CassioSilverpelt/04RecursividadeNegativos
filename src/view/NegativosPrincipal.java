package view;
import controller.NegativosController;

public class NegativosPrincipal {
	public static void main (String[] args) {
		NegativosController neg = new NegativosController();
		int vet[] = {-1, 2, -3, 4, -5, 6};
		int posi = vet.length-1;
		System.out.println(neg.contarNegativos(vet, posi));
	}
}