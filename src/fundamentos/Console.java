package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom ");
		System.out.print("dia!\n\n");
		System.out.println("Bom");
		System.out.println("dia!");
		System.out.printf("Mega sena: %d %d %d %d %d %d \n", 1,2,3,4,5,6);
		System.out.printf("O salário é: %.1f \n", 12430.345);
		System.out.printf("O nome dele é %s \n","Saulo Capistrano");
		
		Scanner X  = new Scanner(System.in);
		System.out.print("Olá, digite sua matrícula: ");
		String matricula = X.nextLine();
		System.out.print(" Agora digite seu curso ");
		String curso = X.nextLine();
		
		System.out.print(" Agora digite sua idade ");
		int idade  = X.nextInt();
		
		System.out.println(" A matricula de Saulo Capistrano é: "+ matricula+
				" ele está cursando: "+ curso + " ele tem "+idade+ " anos. ");
		
		System.out.printf(" %s %s tem , %d anos de idade ", 
				matricula,curso,idade);
		
		X.close();
	}

}
