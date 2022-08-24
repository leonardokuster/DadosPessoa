package pacotePrincipal;

public class dadosEndereco {
	
	String logradouro;
	int numero;
	String complemento;
	String cidade;
	String estado;
	String CEP;
	
	
	String imprimirDadosEndereco() {
		return "Rua " + logradouro + ", " + Integer.toString(numero) + ", " + 
				complemento + ". Cidade: " + cidade + ". Estado: " + estado +
				". CEP: " + CEP;
	}

}
