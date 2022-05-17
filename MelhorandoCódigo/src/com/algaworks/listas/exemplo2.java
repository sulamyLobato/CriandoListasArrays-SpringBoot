package com.algaworks.listas;

import java.util.List;
import java.util.ArrayList;

public class exemplo2 {
	
	
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		
		
		clientes.add(new Cliente(1L, "Sulamy"));
		clientes.add(new Cliente(2L, "Alcymara"));
		clientes.add(new Cliente(3L, "Cristiane"));
		
		clientes.forEach(cliente -> System.out.printf("ID: %d, Nome:%s, %n",
				cliente.getId(), cliente.getNome()));
		
	}

}
