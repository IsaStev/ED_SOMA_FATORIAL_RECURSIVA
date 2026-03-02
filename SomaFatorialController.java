package controller;
//RECEBE N INTEIRO E EXIBE SOMATORIA DA SERIE COM FATORIAL
public class SomaFatorialController {

	public SomaFatorialController() {
		super();
	}
	
	public double somatoria(int n) {
        //CONDIÇÃO DE PARADA
        if (n == 1) {
            return 1.0;
        }
        //CHAMADA
        return (1.0 / fatorial(n)) + somatoria(n - 1);
    }

    private double fatorial(int n) {
    	
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }
}