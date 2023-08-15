package Questao5;

public class PilhaDupla {
	 /*
    Pilha utiliza o metodo 	FILO Firt in Last Out (Primeiro a Entrar ultimo a Sair.
     */
    private int[] pilhaDupla;
    private int ultimaPosicaoPilha1;
    private int ultimaPosicaoPilha2;

    //iniciando a pilha vazia
    public PilhaDupla(){
        pilhaDupla = new int[4];
        ultimaPosicaoPilha1 = 0;
        ultimaPosicaoPilha2 = pilhaDupla.length - 1;
    }
    
    //iniciando as pilhas com parametros
    public PilhaDupla(int tam){
        pilhaDupla = new int[tam];
        ultimaPosicaoPilha1 = 0;
        ultimaPosicaoPilha2 = tam - 1;
    }

    public void CheckPilhaVazia(){
        if(ultimaPosicaoPilha1 == 0)
            System.out.println("A pilha 1 está vazia.");
        else if(ultimaPosicaoPilha2 == pilhaDupla.length - 1)
            System.out.println("A pilha 2 está vazia. ");
    }

    public void empilharPilha1(int num){
        if(ultimaPosicaoPilha1 >= pilhaDupla.length)
            System.out.println("Não é possível inserir, lista cheia! ");
        pilhaDupla[ultimaPosicaoPilha1] = num;
        ultimaPosicaoPilha1++;
    }

    public void empilharPilha2(int num){
        if(ultimaPosicaoPilha2 <= 0)
            System.out.println("Não é possível inserir, lista cheia!");
        pilhaDupla[ultimaPosicaoPilha2] = num;
        ultimaPosicaoPilha2--;
    }

    public int desempilharPilha1(){
        if(pilhaDupla.length <= 0)
            System.out.println("Impossível remover uma pilha vazia.");
        ultimaPosicaoPilha1--;

        int resp = pilhaDupla[ultimaPosicaoPilha1];
        pilhaDupla[ultimaPosicaoPilha1] = 0;
        return resp;
    }

    public int desempilharPilha2(){
        if(pilhaDupla.length <= 0)
            System.out.println("Impossível remover uma pilha vazia.");
        ultimaPosicaoPilha2++;

        int resp = pilhaDupla[ultimaPosicaoPilha2];
        pilhaDupla[ultimaPosicaoPilha2] = 0;
        return resp;
    }

    public void MostrarPilha(){
    for(int i = 0; i<pilhaDupla.length; i++){
        System.out.println("Posicao: " + i + " Elemento: " + pilhaDupla[i]);
    }
    }

    public void MostrarPosicaoPilhas(){
        System.out.println("\n A Ultima posição preenchida na pilha 1 é " + (ultimaPosicaoPilha1-1) + " e o valor é " + pilhaDupla[ultimaPosicaoPilha1-1] + "\n");
        System.out.println("\n A Ultima posição preenchida na pilha 2 é " + (ultimaPosicaoPilha2+1) + " e o valor é " + pilhaDupla[ultimaPosicaoPilha2+1] + "\n");
    }
}
