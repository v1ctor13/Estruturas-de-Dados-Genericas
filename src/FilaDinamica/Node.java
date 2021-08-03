package FilaDinamica;

public class Node<T>{
    
    private T dados;
    private Node<T> prox;
    
    public Node(){
        this.dados = null;
        this.prox = null;
    }
    
    public Node(T d){
        this.dados = d;
        this.prox = null;
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
    
}
