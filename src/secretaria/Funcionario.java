package secretaria;

public class Funcionario {
	
	private String nome = "";
	private int matricula; 
	
	
	public Funcionario(String nome , int matricula)
	{
		this.nome = nome ; 
		this.matricula = matricula ;
		System.out.println("FUNCIONARIO CADASTRADO COM SUCESSO");
			
	}
	
	public void setNome(String nome1){
		nome = nome1 ; 
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setMatricula(int matricula1){
		matricula = matricula1;
	}
	
	public int getMatricula(){
		return matricula;
	}
	

}
