package view;
import controller.SomaFatorialController;

//RECEBE N INTEIRO E EXIBE SOMATORIA DA SERIE COM FATORIAL
public class SomaFatorialView {

	public static void main(String[] args) {
		
		SomaFatorialController sc = new SomaFatorialController();
		
        int n = 4;
        System.out.println("Resultado da somatória: " + sc.somatoria(n));
	}
}