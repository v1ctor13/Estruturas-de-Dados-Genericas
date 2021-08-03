package ListaEncadeadaDupla;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Util.Pessoa;

public class LeitorEscritorDocumentoListaDupla<T>{
    
    public int escrever(ListaDupla li){
        try{
            FileWriter file;
            file = new FileWriter("dadosListaDupla.txt");
            
            PrintWriter pw = new PrintWriter(file);
            
            Node<T> node = li.getInicio();
            while(node != null){
                pw.print(node.getDados());
                node = node.getProx();
            }
            file.close();
            return 1;
        }catch(IOException e){
            System.err.println("não foi possível escrever no arquivo: " + e);
            return -1;
        }
    }
    
    public int ler(ListaDupla li){
        String nome;
        int idade;
        int id; 
        
        try{
            FileReader file;
            file = new FileReader("dadosListaDupla.txt");
            
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
                li.inserirFim(p);
                
                linha = br.readLine();
            }
            file.close();
            return 1;
        }catch(FileNotFoundException e) {
            System.err.println("erro: o arquivo não foi encontrado: " + e);
            return -1;
        }catch(IOException e){
            System.err.println("erro: não foi possível ler do arquivo: " + e);
            return -1;
        }
    }
    
}
