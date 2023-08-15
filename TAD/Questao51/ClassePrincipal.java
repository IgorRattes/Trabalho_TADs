package Questao51;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Questão - 5 \n");
		PilhaNegPos p2 = new PilhaNegPos(6);
		p2.InserirP(-1);
		p2.InserirP(1);
		p2.InserirP(-2);
		p2.InserirP(2);
		p2.InserirP(-3);
		p2.InserirP(3);
		p2.InserirP(4);
		p2.InserirP(-4);
		p2.ExibirP();
	}

}
