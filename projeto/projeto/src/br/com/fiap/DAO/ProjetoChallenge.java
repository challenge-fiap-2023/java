package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProjetoChallenge {

	
	public Connection minhaConexao;
	
	public ProjetoChallenge() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Inserir 
	public String inserir (Cliente objCliente) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" insert into T_FIAP_CLIENTE (ID_CLIENTE, TP_CLIENTE, END_EMAIL, NMR_TELEFONE, DS_SENHA, NMR_CELULAR, DT_CRIADO, DT_ATUALIZADO)values (?,?,?,?,?,?,?,?)");
		
		stmt.setInt(1, objCliente.getClienteId());
		stmt.setBoolean(2, objCliente.getTipoCliente());
		stmt.setString(3, objCliente.getEmail());
		stmt.setInt(4, objCliente.getTelefone());
		stmt.setInt(5, objCliente.getCelular());
		stmt.setInt(6, objCliente.getSenha());
		stmt.setDate(7 , new Date (System.currentTimeMillis()));
		stmt.setDate(8 , new Date (System.currentTimeMillis()));
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso";
		
	}


}	
