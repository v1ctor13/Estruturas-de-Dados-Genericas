package ListaEncadeadaDupla;

public class Node<T>{
    
    private T dados;
    private Node<T> prox;
    private Node<T> ant;
    
    public Node(){
        this.dados = null;
        this.prox = null;
        this.ant = null;
    }
    
    public Node(T d){
        this.dados = d;
        this.prox = null;
        this.ant = null;
    }

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }
    
    public Node<T> getProx() {
        return prox;
    }

    public void setProx(Node<T> prox) {
        this.prox = prox;
    }

    public Node<T> getAnt() {
        return ant;
    }

    public void setAnt(Node<T> ant) {
        this.ant = ant;
    }
}
