package br.com.sprint.excecao;
 
public class Excecoes {

     public static String tratarExcecao(Exception e) {

         if(e instanceof NullPointerException) {
        	 return "Objeto Nulo";

         }else if(e instanceof NumberFormatException) {
             return "N�mero inv�lido";

         }else if(e instanceof ArrayIndexOutOfBoundsException) {
             return "Vetor estourou";
         }
         else {
             e.printStackTrace();
             return "Exce��o n�o tratada";
         }
     }
 }