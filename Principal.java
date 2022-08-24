package pacotePrincipal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Scanner entradaCaractere = new Scanner(System.in);
		Scanner entradaNumero = new Scanner(System.in);
		char imprimirEndereco;
		
		System.out.print("Digite o nome: ");
		p1.nome = entradaCaractere.nextLine();
		
		System.out.print("Digite a idade: ");
		p1.idade = entradaNumero.nextInt();
		
		System.out.print("Digite o CPF: ");
		p1.CPF = entradaCaractere.nextLine();
		
		System.out.print("Digite a rua: ");
		p1.endereco.logradouro = entradaCaractere.nextLine();
		
		System.out.print("Digite o numero: ");
		p1.endereco.numero = entradaNumero.nextInt();
		
		System.out.print("Digite o complemento: ");
		p1.endereco.complemento = entradaCaractere.nextLine();
		
		System.out.print("Digite a cidade: ");
		p1.endereco.cidade = entradaCaractere.nextLine();
		
		System.out.print("Digite o estado: ");
		p1.endereco.estado = entradaCaractere.nextLine();
		
		System.out.print("Digite o CEP: ");
		p1.endereco.CEP = entradaCaractere.nextLine();
		
		System.out.print("Deseja imprimir os dados com o endereco?");
		imprimirEndereco = entradaCaractere.nextLine().charAt(0);
		
		System.out.printf("%s\n", p1.imprimirDadosPessoa(imprimirEndereco));
	}

}
