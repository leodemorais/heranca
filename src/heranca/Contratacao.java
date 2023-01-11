package heranca;

public class Contratacao {
	
	public static void main(String[] args) {
		
		Pessoa funcionario1 = new Pessoa("Pagu", 123, 2);
		Funcionario funcionario2 = new Funcionario("Jazz", 231, 2, "aulas");
		Coordenador coordenador = new Coordenador();
		
		coordenador.setNome("Lisia");
		coordenador.setMatricula(321321);
		coordenador.setSetor("Aulas");
		coordenador.setArea("Ensino");
		
				
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario2.getSetor());
		System.out.println(coordenador.getIdade());
		
	}

}
