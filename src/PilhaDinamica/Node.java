package PilhaDinamica;

public class Node<T>{
    
    private T dados;
    private Node<T> anterior;
    
    public Node(){
        this.dados = null;
        this.anterior = null;
    }
    
    public Node(T dados){
        this.dados = dados;
        this.anterior = null;
    }
    
    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }

    public Node<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Node<T> anterior) {
        this.anterior = anterior;
    }
    
    
    
}
