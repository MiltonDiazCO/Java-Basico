package basico;

public class ClaseMath {
	public static void main(String[] args) {
		
		// la clase Math permite hacer calculos matematicos
		
		// calcular ra�z cuadrada
		double raiz = Math.sqrt(9.0);
		System.out.println(raiz);
		
		// redondear un n�mero
		int numRound = Math.round(3.0F);
		System.out.println(numRound);

		// elevar un n�mero a una potencia
		int numPotencia = (int) Math.pow(5.0, 3.0);
		System.out.println(numPotencia);		
	}
}