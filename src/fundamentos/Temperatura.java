package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		int f = 86; 
		final int AJUSTE = 32; 
		final double FATOR = 5.0/9.0; 
		
		double calculo = (f - AJUSTE) * FATOR;
		System.out.println("A temperatura em celcios é: "+ calculo+ " °C");
	
		
		
	}
}
