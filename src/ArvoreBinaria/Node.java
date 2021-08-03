package ArvoreBinaria;

public class Node<T>{
    
    private T dados;
    private Node<T> esq;
    private Node<T> dir;
    private Node<T> pai;
    
    public Node(T d){
        this.dados = d;
        this.esq = null;
        this.dir = null;
    }
    
    @Override 
    public String toString(){
        return this.getDados().toString() + "pai: " + this.getPai().getDados().toString().split(" ")[2] + "\n";
    }
    
    public void imprimirSubArvore(Node<T> r, int nivel){
        if(r != null){
            System.out.println(r.getDados());
            imprimirSubArvore(r.getEsq(), nivel++);
            imprimirSubArvore(r.getDir(), nivel++);
        }
    }
    
    public Node<T> getEsq() {
        return esq;
    }

    public void setEsq(Node<T> primeiroFilho) {
        this.esq = primeiroFilho;
    }

    public Node<T> getDir() {
        return dir;
    }

    public void setDir(Node<T> proximoIrmao) {
        this.dir = proximoIrmao;
    }

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }

    public Node<T> getPai() {
        return pai;
    }

    public void setPai(Node<T> pai) {
        this.pai = pai;
    }
    
}
