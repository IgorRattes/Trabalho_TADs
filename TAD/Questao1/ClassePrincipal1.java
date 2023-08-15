package Questao1;

public class ClassePrincipal1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista(10);

		lista.InserirFim("1");
		lista.InserirFim("2");
		lista.InserirFim("3");
		lista.InserirFim("4");
		lista.InserirFim("5");
		lista.InserirFim("6");
		lista.InserirFim("7");
		lista.InserirFim("8");
		lista.InserirFim("9");
		lista.InserirFim("10");
		lista.Mostrar();
		System.out.println("\n");
		lista.inserirN1N2("4", "Substituido");
		System.out.println("\n");
		lista.Mostrar();
		
		System.out.println("\n Valor Removido: "+lista.RemoverPosicao(5)+" \n ");
		lista.Mostrar();
	}

}


