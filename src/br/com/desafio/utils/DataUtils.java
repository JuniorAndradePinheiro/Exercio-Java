package br.com.desafio.utils;

import java.time.LocalDate;

import static java.time.LocalDate.now;

public class DataUtils {

    public static Integer somaAnoEmDataAtual(Integer qtdAnosFuturos){

        LocalDate dataAtual = now();
        LocalDate dataFutura = dataAtual.plusYears(qtdAnosFuturos);
        return dataFutura.getYear();
    }

    public static Integer diferencaDeAnos(Integer qtdAnosFuturos){

        LocalDate dataAtual = now();
        LocalDate dataFutura = dataAtual.plusYears(qtdAnosFuturos);
        return dataFutura.getYear() - dataAtual.getYear();
    }
}
