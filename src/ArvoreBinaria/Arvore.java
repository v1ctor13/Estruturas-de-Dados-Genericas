package ArvoreBinaria;

public class Arvore<T>{
    
    private Node<T> raiz;
    
    public Arvore(){
        this.raiz = null;
    }
    
    public int inserirRaiz(Node<T> dado){
        if(this.raiz == null){
            this.setRaiz(dado);
            return 1;
        }else{
            return 0;
        }
    }   
    
    public void inserirEsq(Node<T> r, Node<T> dado){
        r.setEsq(dado);
        dado.setPai(r);
    }
    
    public void inserirDir(Node<T> r, Node<T> dado){
        r.setDir(dado);
        dado.setPai(r);
    }
    
    public void imprimir(Node<T> r, int nivel){
        if(r != null){
            System.out.println(r.getDados());
            imprimir(r.getEsq(), nivel++);
            imprimir(r.getDir(), nivel++);
        }
    }
    
    public Node<T> localizar(Node<T> r, T dado){
        Node<T> esq = null;
        Node<T> dir = null;
        
        if(dado.equals(r.getDados()) == false){
            if(r.getEsq() != null){
                esq = localizar(r.getEsq(), dado);
            }
            if(esq == null){
                if(r.getDir() != null){
                    dir = localizar(r.getDir(), dado);
                }
                if(dir == null){
                    return null;
                }
                else{
                    return dir;
                }
            }
            else{
                return esq;
            }
        }
        else{
            return r;
        }
    }
    
    public Node<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Node<T> raiz) {
        this.raiz = raiz;
    }
    
}
