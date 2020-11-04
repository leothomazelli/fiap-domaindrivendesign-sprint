package br.com.sprint.excecao;

import java.sql.SQLIntegrityConstraintViolationException;

public class Excecoes {

     public static String tratarExcecao(Exception e) {

         if(e instanceof NullPointerException) {
        	 return "Objeto Nulo";

         }else if(e instanceof NumberFormatException) {
             return "Número inválido";
         }else if(e instanceof ArrayIndexOutOfBoundsException) {
             return "Vetor estourou";
         }else if(e instanceof SQLIntegrityConstraintViolationException) {
        	 return "Identificação não encontrada";
         }else {
             e.printStackTrace();
             return "Exceção não tratada";
         }
     }
 }
