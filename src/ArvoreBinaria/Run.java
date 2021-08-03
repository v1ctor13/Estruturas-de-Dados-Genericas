package ArvoreBinaria;
import Util.Pessoa;

public class Run {
    public static void main(String[] args){
        Arvore<Pessoa> arvore = new Arvore<>();
        LeitorEscritorDocumentoArvore<Pessoa> leda = new LeitorEscritorDocumentoArvore<>();
        
//        Node<Pessoa> raiz = new Node(new Pessoa("fulano", 22, 100));
//        Node<Pessoa> p1 = new Node(new Pessoa("ciclano", 30, 101));
//        Node<Pessoa> p2 = new Node(new Pessoa("beltrano", 50, 102));
//        Node<Pessoa> p3 = new Node(new Pessoa("mulambo", 30, 103));
//        Node<Pessoa> p4 = new Node(new Pessoa("fernando", 50, 104));
//        
//        arvore.inserirRaiz(raiz);
//        arvore.inserirDir(raiz, p1);
//        arvore.inserirEsq(raiz, p2);
//        arvore.inserirDir(p1, p3);
//        arvore.inserirEsq(p1, p4);
        
//        arvore.imprimir(raiz, 0);
        
//        raiz.imprimirSubArvore(p1, 0);

//        Node busca = arvore.localizar(raiz, p4.getDados());
//        System.out.println(busca);

        leda.ler(arvore);

    }
}
