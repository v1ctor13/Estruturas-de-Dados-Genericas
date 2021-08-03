package FilaDinamica;

public class Fila<T>{
    
    private Node<T> inicio;
    private Node<T> fim;

    public Fila(){
        this.inicio = null;
        this.fim = null;
    }
    
    public int inserir(Node<T> dado){
        // se a fila estiver vazia
        if(this.tamanho() == 0){
            this.setInicio(dado);
            this.setFim(dado);
            dado.setProx(null);
            return 1;
        }
        // se a fila não estiver vazia
        else{
            this.getFim().setProx(dado);
            dado.setProx(null);
            this.setFim(dado);
            return 1;
        }
    }
    
    public Node<T> remover(){
        // fila vazia
        if(this.tamanho() == 0){
            System.err.println("erro: a fila está vazia.");
            return null;
        }
        // não vazia
        else{
            Node<T> node = this.getInicio();
            this.setInicio(node.getProx());
            return node;
        }
    }
    
    public void imprimir(){
        Node<T> node = this.getInicio();
        while(node != null){
            System.out.println(node.getDados());
            node = node.getProx();
        }
    }
    
    public int tamanho(){
        int contador = 0;
        Node<T> node = this.getInicio();
        while(node != null){
            contador++;
            node = node.getProx();
        }
        return contador;
    }

    public Node<T> getInicio(){
        return inicio;
    }

    public void setInicio(Node<T> inicio){
        this.inicio = inicio;
    }

    public Node<T> getFim(){
        return fim;
    }

    public void setFim(Node<T> fim){
        this.fim = fim;
    }
}
