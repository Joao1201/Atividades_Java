package br.com.generation.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.com.generation.model.Caminhao;
import br.com.generation.model.Motorista;
import br.com.generation.model.Seguro;

public class Motoristas {

	//Map --> tem uma estrutura que n�s conseguimos fazer consultas mais precisas, por
	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();
	
	//Construtor simulando um banco de dados com um Map..
	public Motoristas() {
		Seguro seguro = new Seguro("Parcial - n�o cobre roubo..", 5000.00);
		Caminhao caminhao = new Caminhao("Mercedes - Benz", Optional.ofNullable(seguro));
		Optional<Motorista> motoristaJoao = Optional.of(new Motorista("Jo�o", 23, Optional.ofNullable(caminhao)));
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("Jos�", 35, Optional.ofNullable(null)));
		
		motoristas.put("Jo�o", motoristaJoao);
		motoristas.put("Jos�", motoristaJose);
	}
	
	//M�todo que verifica se o motorista, baseado na String, existe..
	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}
}