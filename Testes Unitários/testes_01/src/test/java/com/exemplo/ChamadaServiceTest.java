package com.exemplo;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ChamadaServiceTest extends TestBase {

    @InjectMocks
    ChamadaService chamadaService;

    @Mock
    ChamadaRepository chamadaRepository;

    Aluno aluno;
    Chamada chamada;
    Chamada outraChamada;

    @BeforeEach
    void setUp() {

        aluno = new Aluno();
        aluno.setNome("João Vitor");
        aluno.setStatusMatricula(true);

        chamada = new Chamada();
        chamada.setAluno(aluno);
        chamada.setPresente(true);
        chamada.setData(LocalDate.now());

        outraChamada = new Chamada();
        outraChamada.setAluno(aluno);
        outraChamada.setPresente(true);
        outraChamada.setData(LocalDate.now());
    }

    @Test
    public void salvarChamada() throws ValidacaoException {
        Mockito.when(chamadaRepository.salvar(chamada)).thenReturn(outraChamada);
        var resultado = chamadaService.apply(chamada);
        Mockito.verify(chamadaRepository).salvar(chamada);
        Assertions.assertEquals(resultado.getData(), outraChamada.getData());
    }

    @Test
    void verificaAlunoNaoMatriculado() {
        chamada.getAluno().setStatusMatricula(false);
        var validacao = Assertions.assertThrows(
                ValidacaoException.class,
                () -> chamadaService.apply(chamada));

        Assertions.assertEquals("Aluno não matriculado", validacao.getMessage());
    }
}