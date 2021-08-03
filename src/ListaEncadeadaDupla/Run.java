package ListaEncadeadaDupla;
import Util.Pessoa;

public class Run{
    public static void main(String[] args){
//        LeitorEscritorDocumentoListaDupla ledld = new LeitorEscritorDocumentoListaDupla();




        ListaDupla<Pessoa> li = new ListaDupla<>();
        
        li.inserirFim(new Node(new Pessoa("victor", 22, 100)));
        
//        Node<Pessoa> n1 = new Node(new Pessoa("victor", 22, 100));
//        Node<Pessoa> n2 = new Node(new Pessoa("vinicius", 24, 101));
//        Node<Pessoa> n3 = new Node(new Pessoa("silva", 23, 102));
//        Node<Pessoa> n4 = new Node(new Pessoa("dos", 52, 103));
//        Node<Pessoa> n5 = new Node(new Pessoa("santos", 25, 104));
//        
//        Node<Pessoa> p6 = new Node(new Pessoa("lucas", 18, 105));
//        
//        Pessoa quem = new Pessoa("silva", 23, 102);
//        
//        li.inserirFim(n1);
//        li.inserirFim(n2);
//        li.inserirFim(n3);
//        li.inserirFim(n4);
//        li.inserirFim(n5);
//        
//        li.imprimir();
        
//        ledld.escrever(li);
//        ledld.ler(li);
        li.imprimir();
    }
}
