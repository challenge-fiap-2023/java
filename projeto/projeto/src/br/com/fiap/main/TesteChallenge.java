package br.com.fiap.main;

import java.util.Date;
import java.time.Year;

import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import br.com.fiap.beans.Chamados;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Guinchos;
import br.com.fiap.beans.Motorista;


public class TesteChallenge {

	//Metodos Statics
	//String
	static String texto (String j){
		return JOptionPane.showInputDialog(j);
	}
	//Int
	static int inteiro (String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	//Double
	static double real (String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	//Year 
	static Year ano (String j){
		return Year.parse(JOptionPane.showInputDialog(j));
	}
	
	//Date 
	static Date data (String j){
		String dateString = JOptionPane.showInputDialog(j);
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			return dateFormat.parse(dateString);
		} catch (Exception e) {
			return null;
		}
	
	}
	//Boolean
	static boolean tf (String j){
		return Boolean.parseBoolean(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		// Instanciar Objetos
		
		Guinchos objGuinchos = new Guinchos (inteiro("Digite o Id do Guincho"),
				texto("Digite a marca do Guincho"),
				texto("Digite o modelo do Guincho"),
				ano("Digite o ano do Guincho"),
				texto("Digite a placa do Guincho"),
				texto("Digite a cor do Guincho"),
				texto("Digite o chassi do Guincho"),
				texto("Digite o renavam do Guincho"),
				data("Criado em"),
				data("Atualizado em"),
				data("Deletado em"));
		
		
		Cliente objCliente = new Cliente (inteiro("Digite o Id do Cliente"),
				tf("Digite o tipo do Cliente"),
				texto("Digite o email"),
				inteiro("Digite o telefone do Cliente"),
				inteiro("Digite o celular do Cliente"),
				inteiro("Digite a senha do Cliente"),
				data("Criado em"),
				data("Atualizado em"),
				data("Deletado em"));
		
		Chamados objChamados = new Chamados (inteiro("Digite o Id do Chamado"),
				inteiro("Digite o status do Chamado"),
				texto("Digite a descri��o do Chamado"),
				texto("Digite a localiza��o do Chamado"),
				data("Criado em"),
				data("Atualizado em"),
				data("Deletado em"));
	
		
		Motorista objMotorista = new Motorista(inteiro("Digite o Id do Motorista"),
				texto("Digite o nome do Motorista"),
				texto ("Digite o CPF do Motorista"),
				texto ("Digite o RG do Motorista"),
				texto("Digite a CNH do Motorista"),
				data ("Digite a data de nascimento do Motorista"),
				texto("Digite o telefone do Motorista"),
				texto ("Digite o emial do Motorista"),
				texto ("Digite o n�mero de celular do Motorista"),
				texto("Digite o link da foto do Motorista"),
				data("Criado em"),
				data("Atualizado em"),
				data("Deletado em"));
		
	
		//Saidas
		System.out.println("INFORMA��ES DO GUINCHO");
		System.out.println("N�mero de Id: " + objGuinchos.getGuinchoId()+
		"\nQual a marca? " + objGuinchos.getMarca()+
		"\nQual o modelo? " +objGuinchos.getModelo()+
		"\nQual o ano? "+ objGuinchos.getAno()+
		"\nQual a placa? " + objGuinchos.getPlaca()+
		"\nQual a cor? " + objGuinchos.getCor()+
		"\nN�mero do Chassi: " + objGuinchos.getChassi()+
		"\nN�mero do Renavam: " + objGuinchos.getRenavam()+
		"\nInicio: "+ objGuinchos.getCriadoEm()+
		"\nAtualiza��o: " + objGuinchos.getAtualizadoEm()+
		"\nFinalizado: " +objGuinchos.getDeletadoEm());
		
		
		System.out.println("\nINFORMA��ES DO CLIENTE");
		System.out.println("N�mero do Id: " + objGuinchos.getGuinchoId()+
				"\nTipo do Cliente: " +objCliente.getClass()+
				"\nEmail: "+ objCliente.getEmail()+
				"\nTelefone: "+objCliente.getTelefone()+
				"\nCelular: "+ objCliente.getCelular()+
				"\nSenha: "+objCliente.getSenha()+
				"\nInicio: "+objCliente.getCriadoEm()+
				"\nAtualiza��o:" +objCliente.getAtualizadoEm()+
				"\nFinalizado: "+ objCliente.getDeletadoEm());
		
		
		System.out.println("\nINFORMA��ES DO CHAMADO");
		System.out.println("N�mero do Id: "+objChamados.getChamadoId()+
				"\nStatus: "+objChamados.getStatus()+
				"\nDescri��o do Chamado: " +objChamados.getDescricao()+
				"\nLocaliza��o: " + objChamados.getLocalizacao()+
				"\nInicio: " + objChamados.getCriadoEm()+
				"\nAtualiza��o: " +objChamados.getAtualizadoEm()+
				"\nFinalizado: " +objChamados.getDeletadoEm());
		
		
		System.out.println("\nINFORMA��ES DO MOTORISTA");
		System.out.println("N�mero do Id: "+ objMotorista.getMotoristaId()+
				"\nNome: " + objMotorista.getNome()+
				"\nCPF: " + objMotorista.getCpf()+
				"\nRG: " + objMotorista.getRg()+
				"\nCNH: " +objMotorista.getCnh()+
				"\nData de Nascimento: " + objMotorista.getDataNascimento()+
				"\nTelefone: " + objMotorista.getTelefone()+
				"\nEmail: " +objMotorista.getEmail()+
				"\nCelular: " +objMotorista.getCelular()+
				"\nLink da foto: " + objMotorista.getFoto()+
				"\nInicio: " + objMotorista.getCriadoEm()+
				"\nAtualiza��o: " + objMotorista.getAtualizadoEm()+
				"\nFinalizado: " + objMotorista.getDeletadoEm());
	}

}
