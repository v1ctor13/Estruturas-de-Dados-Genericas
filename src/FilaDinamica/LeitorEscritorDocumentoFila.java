package FilaDinamica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Util.Pessoa;

public class LeitorEscritorDocumentoFila<T>{
    
    public int escrever(Fila fila){
        try {
            FileWriter file;
            file = new FileWriter("dadosFila.txt");
            
            PrintWriter pw = new PrintWriter(file);
            
            Node<T> node = fila.getInicio();
            while(node != null){
                pw.print(node.getDados());
                node = node.getProx();
            }
            file.close();
            return 0;
        } catch (IOException e) {
            System.err.println("erro - não foi possível escrever no arquivo: " + e);
            return -1;
        }
    }
    
    public int ler(Fila fila){
        String nome;
        int idade;
        int id;
        
        try{
            FileReader file;
            file = new FileReader("dadosFila.txt");
            
            BufferedReader br = new BufferedReader(file);
            
            String linha = br.readLine();
            while(linha != null){
                String[] partesLeitura;
                partesLeitura = linha.split(" ");
                
                nome = partesLeitura[0];
                idade = Integer.parseInt(partesLeitura[1]);
                id = Integer.parseInt(partesLeitura[2]);
                
                Node<Pessoa> p = new Node<>(new Pessoa(nome, idade, id));
                
                fila.inserir(p);
                
                linha = br.readLine();
            }
            file.close();
            return 0;
        } catch (IOException e) {
            System.err.println("erro - não foi possível ler do arquivo: " + e);
            return -1;
        }
    }
    
}
