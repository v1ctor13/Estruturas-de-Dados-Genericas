package Util;

public class Pessoa{
    private String nome;
    private int idade;
    private int id;
    
    public Pessoa(String nome, int idade, int id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return this.getNome() + " " + this.getIdade() + " " + this.getId() + "\n";
    }
    
    @Override
    public boolean equals(Object objeto){
        if(this.getId() == ((Pessoa)objeto).getId() && this.getIdade() == ((Pessoa)objeto).getIdade() && this.getNome().equals(((Pessoa)objeto).getNome())){
            return true;
        }else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
