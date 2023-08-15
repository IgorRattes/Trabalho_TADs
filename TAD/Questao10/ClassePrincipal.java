package Questao10;

public class ClassePrincipal {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.out.println("EXERCICIO - 10");

	    Empilhadeira empilhadeira = new Empilhadeira(6);
	    empilhadeira.adicionarCaixa(3);
	    empilhadeira.adicionarCaixa(5);
	    empilhadeira.adicionarCaixa(7);
	    empilhadeira.adicionarCaixa(5);
	    empilhadeira.adicionarCaixa(3);
	    empilhadeira.imprimirPilhas();
	}
}
