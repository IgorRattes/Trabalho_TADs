package Questao5;

public class ClassePrincipalPilhaD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilhaDupla pd1 = new PilhaDupla(10);
		System.out.println("QUESTÃO 4\n ");
		pd1.empilharPilha1(1);
		pd1.empilharPilha2(3);
		pd1.empilharPilha2(4);
		pd1.empilharPilha2(5);
		pd1.empilharPilha2(6);
		pd1.empilharPilha2(7);
		pd1.MostrarPilha();
		pd1.MostrarPosicaoPilhas();
		pd1.desempilharPilha2();
		pd1.MostrarPilha();

	}

}
