package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class ChamadaRepository {
	
	private List<Chamada> chamadas = new ArrayList<>();
	
	public Chamada salvar(Chamada chamada) {
		chamadas.add(chamada);
		
		return chamada;

}
}