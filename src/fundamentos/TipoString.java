package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(5));
		// a contagem de índices nas strings é feita a partir do índice zero
		String s = "Boa tarde ";
		
		System.out.println(s.concat("!!!"));
		// a função concat concatena a variável com alguma coisa 
		System.out.println(s+"!!!");
		// outra forma de concatenar uma string com algo é usando o +
		System.out.println(s.startsWith("Boa"));
		// a função startWith verifica qual o início 
		System.out.println(s.toLowerCase().startsWith("boa"));
		// a função toLowerCase transforma caracteres em caixa baixa
		// já a função startWith verifica qual o início
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		// a função toUpperCase transforma caracteres em caixa alta
		// já a função endsWith verifica qual o final
		System.out.println(s.length());
		// a funçaõ length mostra o tamanho dos índices
		System.out.println(s.equals("boa tarde")); 
		// a função equals compara os caracteres dentro de uma variável
		System.out.println(s.equalsIgnoreCase("boa tarde")); 
		/* a função equalsIgnoreCase faz a mesma comparação, 
		porém ignorando letras maiúsculas e minúsculas
		*/	

		var nome = "Saulo";
		var sobrenome = "Capistrano";
		var idade = 38; 
		var salarioLiquido = 6878.987;
		//System.out.println("Este é o "+nome+" "+sobrenome+" ele tem "+idade+" anos, voltou a programar a pouco tempo e seu salário líquido é de R$ "+salarioLiquido);
		System.out.printf("O senhor %s %s tem %d de idade. "
				+ "E ganha R$%.2f de salário líquido."
				, nome, sobrenome, idade,salarioLiquido);
		
		String frase = String.format("O senhor %s %s tem %d de idade. "
				+ "E ganha R$%.2f de salário líquido."
				, nome, sobrenome, idade,salarioLiquido);
		System.out.println(frase);
		
		
	}
	

}
