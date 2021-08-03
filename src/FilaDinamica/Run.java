package FilaDinamica;

import Util.Pessoa;

public class Run {
    public static void main(String[] args){
        Fila<Pessoa> fila = new Fila<>();
        LeitorEscritorDocumentoFila<Pessoa> ledf = new LeitorEscritorDocumentoFila<>();
        
//        Node<Pessoa> p1 = new Node<>(new Pessoa("Dracula", 1062, 1));
//        Node<Pessoa> p2 = new Node<>(new Pessoa("Alucard", 570, 2));
//        Node<Pessoa> p3 = new Node<>(new Pessoa("Eren", 18, 3));
//        Node<Pessoa> p4 = new Node<>(new Pessoa("Levi", 30, 4));
        
//        fila.inserir(p1);
//        fila.inserir(p2);
//        fila.inserir(p3);
//        fila.inserir(p4);
        
//        fila.remover();
//        fila.remover();
//        fila.remover();
//        fila.remover();
//        fila.remover();
        
//        ledf.escrever(fila);
        ledf.ler(fila);
        fila.imprimir();
        
        System.out.println("tamanho: " + fila.tamanho());
    }
}
