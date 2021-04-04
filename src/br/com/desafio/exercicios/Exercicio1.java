package br.com.desafio.exercicios;

import br.com.desafio.utils.DataUtils;
import br.com.desafio.utils.LerArquivoExemplo;

import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    /*
    ler um arquivo contendo o  nome idade e sexo da pessoa
    capturar a idade da pessoa e calcular quandos anos ela terá daqui a 15 anos
    o nome da pessoa -   Imprimir o ano futuro - voce terá x anos
    Ex:
    Aline - em 2036 voce terá 45 anos!

    obs, ganhará mais pontos se fizer de forma que funcione para qlqr ano
     */

    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        System.out.println("Entre com o número de anos");
        int anoNoFuturo = tc.nextInt();

        List<String> pessoas = LerArquivoExemplo.lerArquivo("pessoas.txt");

        for (String pessoa :pessoas) {
            String array[] = pessoa.split(";");
            int idade = Integer.parseInt(array[1]);

            System.out.println(array[0] + " terá " + (idade + DataUtils.diferencaDeAnos(anoNoFuturo)) + " anos em " + DataUtils.somaAnoEmDataAtual(anoNoFuturo));
        }
    }

}
