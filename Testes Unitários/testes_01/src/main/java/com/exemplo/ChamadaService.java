package com.exemplo;

public class ChamadaService {

	private ChamadaRepository chamadaRepository;

	public ChamadaService(ChamadaRepository chamadaRepository) {
		this.chamadaRepository = chamadaRepository;
	}

	public Chamada apply(Chamada chamada) throws ValidacaoException {

		chamada.getAluno().alunoMatriculado();

		var salvarChamada = chamadaRepository.salvar(chamada);

		return salvarChamada;
	}
}
