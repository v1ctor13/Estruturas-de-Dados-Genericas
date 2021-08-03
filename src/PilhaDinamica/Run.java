package PilhaDinamica;

import Util.Pessoa;

public class Run {
    public static void main(String[] args){
        Pilha<Pessoa> pilha = new Pilha<>();
        LeitorEscritorDocumentoPilha ledp = new LeitorEscritorDocumentoPilha();
        
        Node<Pessoa> p1 = new Node<>(new Pessoa("vitinho", 27, 1000));
        Node<Pessoa> p2 = new Node<>(new Pessoa("vini", 40, 1001));
        Node<Pessoa> p3 = new Node<>(new Pessoa("silva", 48, 1002));
        
//        pilha.empilhar(p1);
//        pilha.empilhar(p2);
//        pilha.empilhar(p3);
        
//        pilha.imprimir();
//        pilha.desempilhar();
//        pilha.desempilhar();
//        pilha.imprimir();

//        ledp.escrever(pilha);
        ledp.ler(pilha);
        
        pilha.imprimir();
        
        System.out.println("Tamanho: " + pilha.tamanho());
    }
}
