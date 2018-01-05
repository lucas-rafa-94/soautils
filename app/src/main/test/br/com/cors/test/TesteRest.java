package br.com.cors.test;


import br.com.rest.RestCaller;

public class TesteRest {
	
	public static void main(String[] args) {
		try {
			String output [] = new String [2];
			output = RestCaller.restCaller("Basic c29hY3NpbnRlZ3JhdGlvbnVzZXI6Y2Y3WlB4VlY2ajZLeEx3VA==", "/rest/venda-online/v2/produtos/69135/rede-credenciada?municipio=SAO%20PAULO&regiao=TODAS%20AS%20REGIÕES&bairro=TODOS%20OS%20BAIRROS&especialidade=CIRURGIA&uf=SP&", "GET", "application/json" ,"");
			System.out.println(output[0]);
			System.out.println(output[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
