package com.webapp.escola_xyz_b.Controller;

import com.webapp.escola_xyz_b.Model.Aluno;
import com.webapp.escola_xyz_b.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {


    @Autowired
    private AlunoService alunoService;

    @GetMapping("/listar")
    public String listarAlunos(Model model) {
        List<Aluno> alunos = alunoService.listarAlunos();
        model.addAttribute("alunos", alunos);
        return "interna/interna-alunos";
    }

    @GetMapping("/adicionar")
    public String exibirFormularioAdicao(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "interna/interna-create-alunos";
    }

    @PostMapping("/salvar")
    public String salvarAluno(@ModelAttribute("aluno") Aluno aluno) {
        alunoService.criarAluno(aluno);
        return "redirect:/alunos/listar";
    }







    // @Autowired
    // private AlunoService alunoService;

    // @GetMapping
    // public List<Aluno> listarAlunos() {
    //     return alunoService.listarAlunos();
    // }

    // // @GetMapping("/{cpf}")
    // // public Aluno encontrarAlunoPorCpf(@PathVariable String cpf) {
    // //     Optional<Aluno> aluno = alunoService.encontrarAlunoPorCpf(cpf);
    // //     return aluno.orElse(null);
    // // }

    // @PostMapping
    // public Aluno criarAluno(@RequestBody Aluno aluno) {
    //     return alunoService.criarAluno(aluno);
    // }

    // // @PutMapping("/{cpf}")
    // public Aluno atualizarAluno(@PathVariable String cpf, @RequestBody Aluno aluno) {
    //     if (!cpf.equals(aluno.getCpf())) {
    //         // Tratar erro, CPF do aluno não corresponde ao CPF informado na URL
    //         return null;
    //     }
    //     return alunoService.atualizarAluno(aluno);
    // }

    // @DeleteMapping("/{cpf}")
    // public void excluirAluno(@PathVariable String cpf) {
    //     alunoService.excluirAluno(cpf);
    // }
}
