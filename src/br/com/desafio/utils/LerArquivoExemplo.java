package br.com.desafio.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoExemplo {

    private LerArquivoExemplo(){}

    public static List<String> lerArquivo (String fileName){

        List<String> pessoas = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(fileName));


                while (sc.hasNext()){

                    String linha = sc.nextLine();
                    pessoas.add(linha);
//                    System.out.println(linha);
                }


        } catch (FileNotFoundException e) {
            System.out.println("ERRO AO LER ARQUIVO");
            e.printStackTrace();
        }
        return pessoas;
    }
}
