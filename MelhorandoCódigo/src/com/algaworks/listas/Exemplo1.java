package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//Criando Listas com spring

public class Exemplo1 {
	
	
   public static void main(String []args) {
	  java.util.List<String> nomes = new ArrayList<>();
	  
	   
	   nomes.add("Sulamy");
	   nomes.add("Alcymara");
	   nomes.add("Cristiane");
	   
	   //nomes.remove(0);
	   
	   //voc� tamb�m pode acessar pelo �ndice usando
	   //o for tradicional
	   
	   //for (int i = 0; i< nomes.size(); i++) {
		//System.out.println("Nome: " + nomes.get(i));
	  
	   //tamb�m pode fazer assim
	   
     //for (String nome : nomes) {
    	// System.out.println("Nomes" + nome);
   
	   
	   // Voc� tamb�m pode usar o m�todo forEach   
  
	   // nomes.forEach(new Consumer<String>() {
   
	   
      //    @Override
	     // public void accept(String t) {
	  //  System.out.println("----");
	   //  System.out.println(t);
	

	   
	   // usar a express�o  lambda

		//nomes.forEach(nome  ->{
			//System.out.println(nome);
	   
	   // simplificando
	   
			//nomes.forEach(nome  ->System.out.println(nome));
		   //melhorando e limpand o c�digo
         
	    //nomes.forEach(System.out::println);
   }
   
   }


   

