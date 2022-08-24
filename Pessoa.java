package pacotePrincipal;

public class Pessoa {
	
	int idade;
	String nome;
	String CPF;
	dadosEndereco endereco;
	
	Pessoa(){
		endereco = new dadosEndereco();
	}
	
	// Exemplo de Construtor
	// Pessoa(String name, int age, String id){
	//	nome = name;
	//	idade = age;
	//	CPF = id;
	//	endereco = new dadosEndereco();
	// }
	
	String imprimirDadosPessoa(char imprimirEndereco) {
		
		if(imprimirEndereco == 'N' || imprimirEndereco == 'n')
			return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + "\nCPF: " +
					CPF;
		else
			return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + "\nCPF: " +
					CPF + "\n" + endereco.imprimirDadosEndereco();
	}
	
	int anoNascimento() {
		return 2022 - idade;
	}

}
