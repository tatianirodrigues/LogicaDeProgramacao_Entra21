/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int login = 1234, senha = 6869, senhaDig, loginDig;
		
		for (int i = 0; i < 3; i++) {
			
		System.out.println("\nLogin:");
		loginDig = entrada.nextInt();
		System.out.println("Senha:");
		senhaDig = entrada.nextInt();
			
		if (login == loginDig && senha == senhaDig) {
		System.out.println("Você entrou!");
		break;
		}
		else if (i ==2) {
		System.out.println("\nCadastro bloqueado!");
		}
		else if (login != loginDig && senha != senhaDig ) {
		System.out.println("\nLogin e senha Inválidos!!");	
		}
		else if (login != loginDig ) {
		System.out.println("\nLogin Inválido!!");	
		}
		else if (senha != senhaDig) {
		System.out.println("\nSenha Inválida!!");	
		}
		}
	}

}
