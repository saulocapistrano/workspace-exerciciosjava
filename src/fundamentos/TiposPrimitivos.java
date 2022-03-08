package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informa��es do funcion�rio

		// tipos num�ricos inteiro
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;// usamos o L ao final do n�mero para dizer ao Java que o n�mero � long

		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// tipo booleano
		boolean estaDeFerias = true; // true e false

		// tipo caractere
		char status = 'A';

		// usando as as vari�veis

		System.out.println("O funcionario trabalhou "+ anosDeEmpresa*365+" dias.");
		System.out.println("A matricula do funcionario �: "+id );
		System.out.println("O funcionario fez "+ numeroDeVoos / anosDeEmpresa +" voos por ano");
		System.out.println("O funcionario fez "+ pontosAcumulados / anosDeEmpresa +" pontos ano");
		System.out.println("O funcionario fez "+ pontosAcumulados / vendasAcumuladas +" pontos por venda");
		System.out.println("O funcionario fez "+ vendasAcumuladas / salario +" de comis�o");
		System.out.println("O status do funcion�rio �: " +status);
		System.out.println("Est� de f�rias? " +estaDeFerias);

		
	}

}
