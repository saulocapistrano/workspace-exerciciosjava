package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário

		// tipos numéricos inteiro
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;// usamos o L ao final do número para dizer ao Java que o número é long

		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// tipo booleano
		boolean estaDeFerias = true; // true e false

		// tipo caractere
		char status = 'A';

		// usando as as variáveis

		System.out.println("O funcionario trabalhou "+ anosDeEmpresa*365+" dias.");
		System.out.println("A matricula do funcionario é: "+id );
		System.out.println("O funcionario fez "+ numeroDeVoos / anosDeEmpresa +" voos por ano");
		System.out.println("O funcionario fez "+ pontosAcumulados / anosDeEmpresa +" pontos ano");
		System.out.println("O funcionario fez "+ pontosAcumulados / vendasAcumuladas +" pontos por venda");
		System.out.println("O funcionario fez "+ vendasAcumuladas / salario +" de comisão");
		System.out.println("O status do funcionário é: " +status);
		System.out.println("Está de férias? " +estaDeFerias);

		
	}

}
