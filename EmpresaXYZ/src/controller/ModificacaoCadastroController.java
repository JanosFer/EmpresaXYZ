package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.ListaEncadeada;

public class ModificacaoCadastroController {
	private void novoArquivo(ListaEncadeada<Cliente> l, String nomeArquivo) {
		File arquivo = new File("C:\\TEMP\\" + nomeArquivo);
		int tamanho = l.size();
		int i = 0;
		StringBuffer buffer = new StringBuffer();
		while(i < tamanho) {
			try {
				buffer.append(l.get(i));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} 
			i++;
		}
		try (BufferedWriter gravar = new BufferedWriter(new FileWriter(arquivo))){
			gravar.write(buffer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void novoCadastro(int idadeMin, int idadeMax, double limiteCredito) {
		ListaEncadeada<Cliente> l = new ListaEncadeada<Cliente>();
		String caminho = "C:\\TEMP\\cadastro.csv.txt";
		File arquivo = new File(caminho);
		try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
			try {
				String linha;
				while((linha = reader.readLine()) != null) {
					String[] dados = linha.split(";");
					Cliente cliente = new Cliente();
					cliente.setCPF(Long.parseLong(dados[0])); 
					cliente.setNome(dados[1]);
					cliente.setIdade(Integer.parseInt(dados[2]));
					cliente.setLimiteCredito(Double.parseDouble(dados[3].replace(",", ".")));
					if((cliente.getIdade() >= idadeMin && cliente.getIdade() <= idadeMax) && cliente.getLimiteCredito() > limiteCredito) {
						l.addLast(cliente);
						System.out.println(cliente.toString());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		novoArquivo(l, "“Idade “+idade+” limite”+limiteCredito;");
	}
}
