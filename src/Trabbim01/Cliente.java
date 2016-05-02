package Trabbim01;

@Tabela("Cad_cliente")
public class Cliente {
	@Coluna(pk = true)
	private int id; 
	
	@Coluna(nome = "CLNOME", tamanho = 150)
	private String nome;
	
	@Coluna(nome = "CLEND", tamanho = 150)
	private String endereco;
	
	@Coluna(nome = "CTELEFONE", tamanho = 10)
	private String telefone;
	
	@Coluna(nome = "CESTADOCIVIL", tamanho = 1)
	private EstadoCivil estadoCivil;

}
