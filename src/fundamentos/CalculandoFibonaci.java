package fundamentos;

public class CalculandoFibonaci {

	public static void main(String[] args) {
		
		int a =1; 
		int b = 0;
		int variavel; // variável auxiliar
		
		for (int i = 0; i<30;i++) {
		variavel = a;	
		a =a+b;
		b = variavel; // auxiliar guardando 
		//o novo 
		//valor de b
		System.out.println(a);
		
		}
	}

}
