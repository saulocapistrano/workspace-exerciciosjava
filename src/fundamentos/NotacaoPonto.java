package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
	 
	 String s = "Bom dia X";
	 s.toUpperCase();//aqui as letras n�o ser�o transformadas em caixa alta
	 
	 String t = "Bom dia X";
	 t =t.replace("X", "Senhora");// faz a troca de uma string por outra 
	 t = t.toUpperCase(); //aqui as letras ser�o transformadas em caixa alta
	 t = t.concat("!!!");
	
	 System.out.println(s+" n�o foi transformado em caixa alta pois n�o foi atribu�do um novo objeto a vari�vel 'a'");
	 System.out.println(t+" transformado em caixa alta devido a 't' ter sido atribu�do um novo objeto, al�m disso agora nesse exemplo com o uso do .replace a string x foi substitu�da pela string Senhora ");

	 String y ="Bom dia Y"
			 .replace("Y", "Saulo")
			 .toUpperCase()
			 .concat("!!!");
	 System.out.println(y);
	
	}

}
