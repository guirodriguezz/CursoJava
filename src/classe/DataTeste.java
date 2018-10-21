package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data nascimento = new Data(14, 9, 2018);
		
		//nascimento.dia = 14;
		//nascimento.mes = 9;
		//nascimento.ano = 1990;
		
		System.out.println(nascimento.formatar());
	}
}
