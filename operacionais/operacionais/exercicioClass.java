package operacionais;

import java.util.Scanner;

public class exercicioClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é : " + idade);
		
		System.out.println("Digite sua nota A, sua nota B, sua nota C, e sua nota D : ");
		float notaA = scan.nextFloat();
		float notaB = scan.nextFloat();
		float notaC = scan.nextFloat();
		float notaD = scan.nextFloat();
		
		var media = (notaA + notaB + notaC + notaD)/4;
		
		System.out.println("Sua media é : " + media);*/		
		
		
		System.out.println("Digite seu valor da hora trabalhada: , e quantidade de horas mes : ");
		int valorhra = scan.nextInt();
		int horatrb = scan.nextInt();
		
		var totalH = (valorhra * horatrb);
		
		System.out.println(totalH);
				
				
		
	}

}
