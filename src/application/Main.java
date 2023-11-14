package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import mode.entities.Cliente;
import mode.entities.Jogo;
import mode.entities.Produto;

public class Main {

	public static void main(String[] Args) {
		
		List<Cliente> lstClientes = new ArrayList<>();
		List<Produto> lstProdutos = new ArrayList<>();
		
		Integer opt;
		
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n" +
					"1 - Criar pessoa\n" +
					"2 - Cadastrar jogo\n" +
					"3 - Mostrar pessoas\n" +
					"4 - Mostrar jogos\n" +
					"5 - Sair"));
			
			switch(opt) {
				case -1:
					System.exit(0);
					break;
				case 1:
					criarPessoa(lstClientes);
					break;
				case 2:
					cadastrarJogo(lstProdutos, lstClientes);
					break;
				case 3:
					mostrarPessoas(lstClientes);
					break;
				case 4:
					mostrarJogos(lstProdutos);
					break;
				case 5:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcao Invalida!");
					break;
			}
		
		}while(opt != 5);
	}
	
	public static void criarPessoa(List<Cliente> list) {
		String nome = JOptionPane.showInputDialog("Nome :");
		String cpf = JOptionPane.showInputDialog("Cpf: " );
		
		/*Cliente cli = new Cliente(nome, cpf);
		
		list.add(cli);*/
		list.add(new Cliente(nome, cpf));
	}
	
	public static void cadastrarJogo(List<Produto> produtos, List<Cliente> clientes) {
		if(clientes.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Sem clientes cadastrados!");
		} else {
			String nome = JOptionPane.showInputDialog("Nome do jogo: ");
			double precoPorDia = Double.parseDouble(JOptionPane.showInputDialog("Preco por dia: "));
			int dias = Integer.parseInt(JOptionPane.showInputDialog("Dias alugado: "));
			
			String categoria = JOptionPane.showInputDialog("Categoria do jogo: ");
			String plataforma = JOptionPane.showInputDialog("Plataforma: ");
			
			String cpfCliente = JOptionPane.showInputDialog("Cpf do cliente: ");
			
			Cliente clienteTemp = null;
			
			for(Cliente i : clientes) {
				if(i.getCpf().equals(cpfCliente)) {
					clienteTemp = i;
				}
			}
			
			if(clienteTemp == null) {
				JOptionPane.showMessageDialog(null, "Cliente nao encontrado!");
			} else {
				produtos.add(new Jogo(nome, precoPorDia, dias, categoria, plataforma, clienteTemp));
			}
		}
	}
	
	public static void mostrarPessoas(List<Cliente> list) {
		if(list.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Sem pessoas a mostrar!");
		} else {
			String str = "";
			for(Cliente i : list) {
				str += i.toString() + "\n";
			}
			JOptionPane.showMessageDialog(null, "Pessoas: \n" + str);
		}
	}
	
	public static void mostrarJogos(List<Produto> list) {
		if(list.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Sem jogos a  mostrar!");
		} else {
			String str = "";
			
			for(Produto i : list) {
				str += i.toString() + "\n";
			}
			
			JOptionPane.showMessageDialog(null, "Produtos/Jogos: \n" + str);
		}
	}
}
