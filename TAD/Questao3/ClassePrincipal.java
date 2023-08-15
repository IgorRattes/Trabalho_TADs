package Questao3;

public class ClassePrincipal {

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
		System.out.println("Invertendo");
		System.out.println("\n");
		lista.inverte();
		lista.Mostrar();
	}

}
