package classe;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Guilherme", 1600, "Analista SAP FI");
		
		System.out.println(funcionario.formatar());
	}
}
