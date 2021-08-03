package PilhaDinamica;

public class Pilha<T>{
    
    private Node<T> topo;
    private Node<T> ultimo;
    
    public Pilha(){
        this.topo = null;
    }
    
    public int empilhar(Node<T> dado){
        // caso a pilha esteja vazia
        if(this.tamanho() == 0){
            this.setTopo(dado);
            this.setUltimo(dado);
            dado.setAnterior(null);
            return 1;
        }
        // caso a pilha não esteja vazia
        else{
            dado.setAnterior(this.getTopo());
            this.setTopo(dado);
            return 1;
        }
    }
    
    public Node<T> desempilhar(){
        // caso a pilha esteja vazia
        if(this.tamanho() == 0){
            System.err.println("erro: a pilha está vazia.");
            return null;
        }else{
            Node<T> node = this.getTopo();
            this.setTopo(node.getAnterior());
            return node;
        }
    }
    
    public void imprimir(){
        if(this.topo != null){
            Node<T> node = this.getTopo();
            while(node != null){
                System.out.println(node.getDados());
                node = node.getAnterior();
            }
        }
    }
    
    public int tamanho(){
        int contador = 0;
        Node<T> node = this.getTopo();
        while(node != null){
            contador++;
            node = node.getAnterior();
        }
        return contador;
    }

    public Node<T> getTopo() {
        return topo;
    }

    public void setTopo(Node<T> topo) {
        this.topo = topo;
    }

    public Node<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node<T> ultimo) {
        this.ultimo = ultimo;
    }
    
    
    
}
