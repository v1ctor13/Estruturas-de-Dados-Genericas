package PilhaDinamica;

import Util.Pessoa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LeitorEscritorDocumentoPilha<T> {
    
    public int escrever(Pilha li){
        try{
            FileWriter file;
            file = new FileWriter("dadosPilha.txt");
            
            PrintWriter pw = new PrintWriter(file);
            
            Node<T> node = li.getTopo();
            while(node != null){
                pw.print(node.getDados());
                node = node.getAnterior();
            }
            file.close();
            return 1;
        }catch(IOException e){
            System.err.println("erro - não foi possível gravar no arquivo: " + e);
            return -1;
        }
    }
    
    public int ler(Pilha li){
        String nome;
        int idade;
        int id;
        
        try{
            FileReader file;
            file = new FileReader("dadosPilha.txt");
            
            BufferedReader br = new BufferedReader(file);
            
            String linha = br.readLine();
            while(linha != null){
                String[] partesLeitura;
                partesLeitura = linha.split(" ");
                
                nome = partesLeitura[0];
                idade = Integer.parseInt(partesLeitura[1]);
                id = Integer.parseInt(partesLeitura[2]);
                
                Node<Pessoa> p = new Node<>(new Pessoa(nome, idade, id));
                
                // Inserindo sempre ao fim da lista, pode ser mudado para li.inserirComeco(p), por exemplo
                li.empilhar(p);
                
                linha = br.readLine();
            }
            file.close();
            return 1;
        }catch(IOException e){
            System.err.println("erro - não foi possível ler do arquivo: " + e);
            return -1;
        }
        
    }
    
}
