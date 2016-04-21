package Trabbim01;

@Tabela("Cad_cliente")
public class Cliente {
	@Coluna(pk = true)
	private int id; 
	@Coluna(nome = "CLNOME")
	private String nome;
	@Coluna(nome = "CLEND")
	private String endereco;


}
