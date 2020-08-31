package br.maua.testes;

import br.maua.utilities.IdGenerator;

import java.time.LocalDateTime;


public class TesteUtilities {
    public static void main(String[] args) {
        System.out.println(""+ LocalDateTime.now().getMonth().getValue());

        System.out.println("Valor Random: " + IdGenerator.generateIdFormatado());
        System.out.println("Valor Random: " + IdGenerator.generateIdFormatado());
        System.out.println("Valor Random: " + IdGenerator.generateIdFormatado());
    }
}
