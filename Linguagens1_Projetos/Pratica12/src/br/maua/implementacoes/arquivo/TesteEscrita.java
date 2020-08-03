package br.maua.implementacoes.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;

public class TesteEscrita {
    public static void main(String[] args) {
        //Cria um arquivo
        File file = new File("nome.txt");

        try{
            //Cria uma conexão para escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria um buffer de escrita
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Escrever algo no arquivo
            bufferedWriter.write("Arquivos!!!\n");
            bufferedWriter.write("1+1 = " + (1+1) + "\n");
            bufferedWriter.write("lulz \n");

            //Forca escrita na hora
//            bufferedWriter.flush();

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();
            //fecha os demais fluxos
            fileWriter.close();
        }
        catch(Exception exception){
            System.out.println("Algo deu errado");
            exception.printStackTrace();
        }
    }
}
