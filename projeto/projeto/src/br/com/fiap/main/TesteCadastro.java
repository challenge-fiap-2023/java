package br.com.fiap.main;


import java.sql.SQLException;


import javax.swing.JOptionPane;

import br.com.fiap.DAO.ProjetoChallenge;
import br.com.fiap.beans.Cliente;


public class TesteCadastro {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// Instanciar 
			try {
				
			ProjetoChallenge dao = new ProjetoChallenge();
			
			Cliente objCliente= new Cliente();
			
			objCliente.setClienteId(inteiro("ID"));
			objCliente.setTipoCliente(texto("Tipo"));
			objCliente.setEmail(texto("Email"));
			objCliente.setTelefone(inteiro("Telefone"));
			objCliente.setCelular(inteiro("Celular"));
			objCliente.setSenha(inteiro("Senha"));
	
			System.out.println(dao.inserir(objCliente));
			
			} catch (NumberFormatException e) {
				System.out.println("Insira um número válido!");
				
			}
	}


}


