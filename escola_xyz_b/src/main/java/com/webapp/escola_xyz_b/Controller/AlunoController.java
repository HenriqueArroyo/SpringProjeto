package com.webapp.escola_xyz_b.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.escola_xyz_b.Model.Aluno;
import com.webapp.escola_xyz_b.Repository.AlunoRepository;

@Controller
public class AlunoController {

    boolean acessoAluno = false;

    @Autowired
    AlunoRepository alr;


    @GetMapping("/interna-aluno")
    public String acessoPageInternaAluno(@RequestParam String registro, Model model) {
        String vaiPara = "";
        if (acessoAluno) {
            vaiPara = "interna/interna-aluno";
        } else {
            vaiPara = "login/login-aluno";
        }
        Aluno aluno = alr.findByRegistro(registro);
        model.addAttribute("aluno", aluno);
        return vaiPara;
    }

    @PostMapping("acesso-aluno")
    public String acessoAluno(@RequestParam String registro,
            @RequestParam String senha) {
        try {
            boolean verificaRegistro = alr.existsByRegistro(registro);
            boolean verificaSenha = alr.findByRegistro(registro).getSenha().equals(senha);
            String url = "";
            if (verificaRegistro && verificaSenha) {
                acessoAluno = true;
                url = "redirect:interna-aluno?registro=" + registro;
            } else {
                url = "redirect:/login-aluno";
                System.out.println("Erro de login");
            }
            return url;
        } catch (Exception e) {
            System.out.println("Erro de login");
            return "redirect:/login-aluno";
        }
    }

    @PostMapping("/pesquisa-aluno")
    public String pesquisaAlunoPorNome(@RequestParam String nome, Model model) {
        // Realiza a pesquisa de alunos por nome
        Iterable<Aluno> alunos = alr.findByNomeContaining(nome);
        model.addAttribute("alunos", alunos);
        return "interna/interna-adm";
    }

}