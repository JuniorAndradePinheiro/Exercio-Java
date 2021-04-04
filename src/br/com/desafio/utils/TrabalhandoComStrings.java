package br.com.desafio.utils;

public class TrabalhandoComStrings {

    public static String[] separaString (String texto, String separador){

       // nome;idade;sexo  texto.split(";")
        return texto.split(separador);

    }
}
