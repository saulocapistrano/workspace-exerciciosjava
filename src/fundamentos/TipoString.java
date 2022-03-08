package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Ol� pessoal".charAt(5));
		// a contagem de �ndices nas strings � feita a partir do �ndice zero
		String s = "Boa tarde ";
		
		System.out.println(s.concat("!!!"));
		// a fun��o concat concatena a vari�vel com alguma coisa 
		System.out.println(s+"!!!");
		// outra forma de concatenar uma string com algo � usando o +
		System.out.println(s.startsWith("Boa"));
		// a fun��o startWith verifica qual o in�cio 
		System.out.println(s.toLowerCase().startsWith("boa"));
		// a fun��o toLowerCase transforma caracteres em caixa baixa
		// j� a fun��o startWith verifica qual o in�cio
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		// a fun��o toUpperCase transforma caracteres em caixa alta
		// j� a fun��o endsWith verifica qual o final
		System.out.println(s.length());
		// a fun�a� length mostra o tamanho dos �ndices
		System.out.println(s.equals("boa tarde")); 
		// a fun��o equals compara os caracteres dentro de uma vari�vel
		System.out.println(s.equalsIgnoreCase("boa tarde")); 
		/* a fun��o equalsIgnoreCase faz a mesma compara��o, 
		por�m ignorando letras mai�sculas e min�sculas
		*/	

		var nome = "Saulo";
		var sobrenome = "Capistrano";
		var idade = 38; 
		var salarioLiquido = 6878.987;
		//System.out.println("Este � o "+nome+" "+sobrenome+" ele tem "+idade+" anos, voltou a programar a pouco tempo e seu sal�rio l�quido � de R$ "+salarioLiquido);
		System.out.printf("O senhor %s %s tem %d de idade. "
				+ "E ganha R$%.2f de sal�rio l�quido."
				, nome, sobrenome, idade,salarioLiquido);
		
		String frase = String.format("O senhor %s %s tem %d de idade. "
				+ "E ganha R$%.2f de sal�rio l�quido."
				, nome, sobrenome, idade,salarioLiquido);
		System.out.println(frase);
		
		
	}
	

}
