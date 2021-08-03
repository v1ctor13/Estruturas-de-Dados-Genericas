package ListaEncadeadaDupla;

public class ListaDupla<T>{
    
    private Node<T> inicio;
    private Node<T> fim;
    
    public ListaDupla(){
        this.inicio = null;
        this.fim = null;
    }
    
    public int inserirComeco(Node<T> dado){
        // se a lista estiver vazia
        if(this.inicio == null){
            this.inicio = dado;
            this.fim = dado;
            return 1;
        }
        //se alista não estiver vazia
        else{
            Node<T> aux = this.inicio;
            this.inicio = dado;
            aux.setAnt(dado);
            dado.setProx(aux);
            dado.setAnt(null);
            return 1;            
        }
    }
    
    public int inserirFim(Node<T> dado){
        // se a lista estiver vazia
        if(this.inicio == null){
            this.inicio = dado;
            this.fim = dado;
            return 1;
        }
        //se alista não estiver vazia
        else{
            Node<T> aux = this.fim;
            this.fim = dado;
            aux.setProx(dado);
            dado.setAnt(aux);
            dado.setProx(null);
            return 1;            
        }
    }
    
    public Node<T> buscarDado(Node<T> dadoBusca){
        Node<T> dadoComparar = this.inicio;
        while(dadoComparar != null){
            if(dadoComparar.getDados().equals(dadoBusca.getDados())){
                return dadoComparar;
            }else{
                dadoComparar = dadoComparar.getProx();
            }
        }
        return null;
    }
    
    public int inserirAntes(Node<T> dadoInserir, Node<T> dadoAlvo){
        if(this.tamanho() == 0){
            System.out.println("A lista está vazia.");
            return -1;
        }else{
            Node<T> res = buscarDado(dadoAlvo);
            if(res != null){
                Node<T> aux = res.getAnt();
                dadoInserir.setProx(res);
                dadoInserir.setAnt(aux);
                aux.setProx(dadoInserir);
                res.setAnt(dadoInserir);
                return 1;
            }
            // alvo não existe
            return 0;
        }
    }
    
    public int inserirDepois(Node<T> dadoInserir, Node<T> dadoAlvo){
        if(this.tamanho() == 0){
            System.out.println("A lista está vazia.");
            return -1;
        }else{
            Node<T> res = buscarDado(dadoAlvo);
            
            if(res != null){
                Node aux = res.getProx();
                
                dadoInserir.setAnt(res);
                dadoInserir.setProx(aux);
                aux.setAnt(dadoInserir);
                res.setProx(dadoInserir);
                return 1;
            }
            // alvo não existe
            return 0;
        }
    }
    
    // remover inicio, fim, antes e depois
    public Node<T> removerInicio(){
        if(this.tamanho() != 0){
            if(this.tamanho() == 1){
                Node<T> remover = this.getInicio();
                this.setFim(null);
                this.setInicio(null);
                return remover;
            }
            
            Node<T> remover = this.getInicio();
            this.setInicio(remover.getProx());
            this.getInicio().setAnt(null);
            return remover;
        }
        else{
            return null;
        }
    }
    
    public Node<T> removerFim(){
        if(this.tamanho() != 0){
            if(this.tamanho() == 1){
                Node<T> remover = this.getInicio();
                this.setFim(null);
                this.setInicio(null);
                return remover;
            }
            
            Node<T> remover = this.getFim();
            this.setFim(remover.getAnt());
            this.getFim().setProx(null);
            return remover;
        }
        else{
            return null;
        }
    }
    
    public Node<T> remover(Node<T> dadoRemover){
        if(this.buscarDado(dadoRemover) != null){
            if(this.tamanho() == 1){
                Node<T> remover = this.getInicio();
                this.setFim(null);
                this.setInicio(null);
                return remover;
            }
            else if(this.tamanho() != 0 && buscarDado(dadoRemover) == this.getInicio()){
                Node<T> remover = this.getInicio();
                this.setInicio(remover.getProx());
                remover.getProx().setAnt(null);
                return remover;
            }
            else if(this.tamanho() != 0 && buscarDado(dadoRemover) == this.getFim()){
                Node<T> remover = this.getFim();
                this.setFim(remover.getAnt());
                remover.getAnt().setProx(null);
                return remover;
            }
            else if(this.tamanho() != 0){
                Node<T> remover = this.buscarDado(dadoRemover);
                Node<T> aux = remover.getAnt();
                aux.setProx(remover.getProx());
                remover.getProx().setAnt(aux);
                return remover;
            }
        }
        return null;// alvo não existe  
    }
    
    public int imprimir(){
        Node<T> node = this.inicio;
        while(node != null){
            System.out.print(node.getDados());
            node = node.getProx();
        }
        return 0;
    }
    
    public int tamanho(){
        Node<T> dado = this.inicio;
        int contador = 0;
        while(dado != null){
            contador++;
            dado = dado.getProx();
        }
        return contador;
    }
    
    public Node<T> getInicio() {
        return inicio;
    }

    public void setInicio(Node<T> inicio) {
        this.inicio = inicio;
    }

    public Node<T> getFim() {
        return fim;
    }

    public void setFim(Node<T> fim) {
        this.fim = fim;
    }
}
