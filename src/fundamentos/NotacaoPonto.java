package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
	 
	 String s = "Bom dia X";
	 s.toUpperCase();//aqui as letras não serão transformadas em caixa alta
	 
	 String t = "Bom dia X";
	 t =t.replace("X", "Senhora");// faz a troca de uma string por outra 
	 t = t.toUpperCase(); //aqui as letras serão transformadas em caixa alta
	 t = t.concat("!!!");
	
	 System.out.println(s+" não foi transformado em caixa alta pois não foi atribuído um novo objeto a variável 'a'");
	 System.out.println(t+" transformado em caixa alta devido a 't' ter sido atribuído um novo objeto, além disso agora nesse exemplo com o uso do .replace a string x foi substituída pela string Senhora ");

	 String y ="Bom dia Y"
			 .replace("Y", "Saulo")
			 .toUpperCase()
			 .concat("!!!");
	 System.out.println(y);
	
	}

}
