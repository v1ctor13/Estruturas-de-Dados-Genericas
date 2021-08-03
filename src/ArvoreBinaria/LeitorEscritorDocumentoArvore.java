package ArvoreBinaria;

import Util.Pessoa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorEscritorDocumentoArvore<T>{
    
    public void ler(Arvore arvore){
        String nome;
        int idade;
        int id;
        
        try{
            FileReader file;
            file = new FileReader("dadosArvore.txt");
            
            BufferedReader br = new BufferedReader(file);
            
            String linha = br.readLine();
            while(linha != null){
                String[] partesLeitura;
                partesLeitura = linha.split(" ");
                
                nome = partesLeitura[0];
                idade = Integer.parseInt(partesLeitura[1]);
                id = Integer.parseInt(partesLeitura[2]);
                
                Node<Pessoa> p = new Node<>(new Pessoa(nome, idade, id));
                
                ///////////////////////////////
                
                linha = br.readLine();
            }
            
            file.close();
            
        }catch(IOException e){
            System.err.println("erro - não foi possível ler do arquivo: " + e);
        }
    }
}
