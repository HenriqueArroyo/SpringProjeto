package com.webapp.escola_xyz_b.Service;

import com.webapp.escola_xyz_b.Model.Aluno;
import com.webapp.escola_xyz_b.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    // Operação de criação
    public Aluno criarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Operação de leitura
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    // Operação de leitura por CPF
    public Optional<Aluno> encontrarAlunoPorCpf(String cpf) {
        return alunoRepository.findById(cpf);
    }

    // Operação de atualização
    public Aluno atualizarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Operação de exclusão
    public void excluirAluno(String cpf) {
        alunoRepository.deleteById(cpf);
    }
}
