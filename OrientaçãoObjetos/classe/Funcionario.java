package classe;

public class Funcionario {
	
	String nome;
	double salario;
	String funcao;
	
	Funcionario (String n, double s, String f){
		nome = n;
		salario = s;
		funcao = f;
	}
	
	String formatar() {
		return String.format("%s recebe %.2f e trabalha como %s", nome, salario, funcao);
	}
}
